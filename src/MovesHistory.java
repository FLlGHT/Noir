import java.util.Collections;
import java.util.List;

/**
 * @author FLIGHT
 */
public class MovesHistory {

  private final List<Move> moves;

  public MovesHistory(List<Move> moves) {
    this.moves = moves;
  }

  public static MovesHistory empty() {
    return new MovesHistory(Collections.emptyList());
  }

  public List<Move> getMoves() {
    return moves;
  }

  @Override
  public String toString() {
    return moves.toString();
  }
}
