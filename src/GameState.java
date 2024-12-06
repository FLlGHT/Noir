/**
 * @author FLIGHT
 */
public class GameState {

  private final CardsField cardsField;

  private final MovesHistory movesHistory;

  private final Character currentCharacter;

  public GameState(CardsField cardsField, MovesHistory movesHistory, Character currentCharacter) {
    this.cardsField = cardsField;
    this.movesHistory = movesHistory;
    this.currentCharacter = currentCharacter;
  }

  public static GameState initialize(CardsField cardsField, Character currentCharacter) {
    return new GameState(
      cardsField,
      MovesHistory.empty(),
      currentCharacter
    );
  }

  @Override
  public String toString() {
    return
      "\n" + cardsField + "\n\n" +
      "movesHistory: " + "\n" + movesHistory + "\n\n" +
      "currentCharacter:" + currentCharacter;
  }
}
