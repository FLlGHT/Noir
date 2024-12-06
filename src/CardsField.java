import java.util.Arrays;

/**
 * @author FLIGHT
 */
public class CardsField {

  private final Character[][] cardPositions;

  public CardsField(Character[][] cardPositions) {
    this.cardPositions = cardPositions;
  }

  public Character[][] getCardPositions() {
    return cardPositions;
  }

  @Override
  public String toString() {
    StringBuilder stringRepresentation = new StringBuilder();

    int[] maxLengths = new int[cardPositions[0].length];

    for (int j = 0; j < cardPositions.length; j++) {
      for (int i = 0; i < cardPositions[0].length; i++) {
        int length = String.valueOf(cardPositions[i][j]).length();
        if (length > maxLengths[j]) {
          maxLengths[j] = length;
        }
      }
    }

    for (Character[] cardPosition : cardPositions) {
      stringRepresentation.append("\n");
      for (int column = 0; column < cardPositions[0].length; ++column) {
        stringRepresentation
          .append(String.format("%" + maxLengths[column] + "s", cardPosition[column]))
          .append(" ");
      }
    }
    return stringRepresentation.toString();
  }
}
