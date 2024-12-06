import java.util.List;
import java.util.Optional;

/**
 * @author FLIGHT
 */

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class MoveResult {

  private final Optional<KilledPlayer> killedPlayer;

  private final Optional<List<CheckedPlayer>> checkedPlayers;

  public MoveResult(Optional<KilledPlayer> killedPlayer, Optional<List<CheckedPlayer>> checkedPlayers) {
    this.killedPlayer = killedPlayer;
    this.checkedPlayers = checkedPlayers;
  }

  public record KilledPlayer(Player player, java.lang.Character character) {}

  public record CheckedPlayer(Player player, List<java.lang.Character> possibleCharacters) {}

  public Optional<KilledPlayer> getKilledPlayer() {
    return killedPlayer;
  }

  public Optional<List<CheckedPlayer>> getCheckedPlayers() {
    return checkedPlayers;
  }
}
