/**
 * @author FLIGHT
 */
public class Main {
  public static void main(String[] args) {
    GameFactory gameFactory = new GameFactory();
    GameWatcher gameWatcher = gameFactory.gameWatcher();
    gameWatcher.start();
  }
}
