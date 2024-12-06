

/**
 * @author FLIGHT
 */
public class CardsFieldFactory {

  private final ConsoleReader consoleReader;

  private final CharacterFactory characterFactory;

  public CardsFieldFactory(ConsoleReader consoleReader, CharacterFactory characterFactory) {
    this.consoleReader = consoleReader;
    this.characterFactory = characterFactory;
  }

  public CardsField createFromUserInput() {
    Character[][] characters = new Character[AntiNoirConfig.rows][AntiNoirConfig.columns];

    for (int row = 0; row < AntiNoirConfig.rows; ++row) {
      Character[] characterRow = readCharacterRow(row);
      int copyPosition = 0;

      System.arraycopy(
        characterRow,
        copyPosition,
        characters[row],
        copyPosition,
        AntiNoirConfig.columns
      );
    }

    return new CardsField(characters);
  }

  public Character[] readCharacterRow(int row) {
    Character[] characters = new Character[AntiNoirConfig.columns];
    String[] inputRow = consoleReader.readNextRow(row);
    for (int column = 0; column < inputRow.length; ++column) {
      try {
        Character character = characterFactory.create(inputRow[column]);
        characters[column] = character;
      } catch (IllegalArgumentException iae) {
        System.out.printf("Invalid character name %s, re-enter character string\n", inputRow[column]);
        return readCharacterRow(row);
      }
    }
    return characters;
  }

  public Character currentCharacterFromUserInput() {
    System.out.println("Write your character: ");
    String currentCharacterInput = consoleReader.readCurrentCharacter().trim();
    try {
      return characterFactory.create(currentCharacterInput);
    } catch (IllegalArgumentException iae) {
      System.out.printf("Such character %s is missing, please enter again: ", currentCharacterInput);
      return currentCharacterFromUserInput();
    }
  }
}
