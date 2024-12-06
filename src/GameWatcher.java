
/**
 * @author FLIGHT
 */
public class GameWatcher {

  private final CardsFieldFactory cardsFieldFactory;

  public GameWatcher(CardsFieldFactory cardsFieldFactory) {
    this.cardsFieldFactory = cardsFieldFactory;
  }

  public void start() {
    System.out.println("New game stated\n");

    CardsField cardsField = cardsFieldFactory.createFromUserInput();
    Character currentCharacter = cardsFieldFactory.currentCharacterFromUserInput();

    GameState gameState = GameState.initialize(cardsField, currentCharacter);
    System.out.printf("current game state: %s\n", gameState);
  }
}
