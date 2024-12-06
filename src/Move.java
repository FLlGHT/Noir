/**
 * @author FLIGHT
 */
public class Move {

  private final Player player;

  private final MoveType moveType;

  private final MoveResult moveResult;

  public Move(Player player, MoveType moveType, MoveResult moveResult) {
    this.player = player;
    this.moveType = moveType;
    this.moveResult = moveResult;
  }

  public Player getPlayer() {
    return player;
  }

  public MoveType getMoveType() {
    return moveType;
  }

  public MoveResult getMoveResult() {
    return moveResult;
  }
}
