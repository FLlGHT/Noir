/**
 * @author FLIGHT
 */
public class GameFactory {

  private CharacterFactory characterFactory() {
    return new CharacterFactory();
  }

  public ConsoleReader consoleReader() {
    return new ConsoleReader();
  }

  public CardsFieldFactory cardsFieldFactory() {
    return new CardsFieldFactory(consoleReader(), characterFactory());
  }

  public GameWatcher gameWatcher() {
    return new GameWatcher(cardsFieldFactory());
  }
}
