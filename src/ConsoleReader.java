
import java.util.Scanner;

/**
 * @author FLIGHT
 */
public class ConsoleReader {

  private static final Scanner scanner = new Scanner(System.in);

  public String[] readNextRow(int row) {
    System.out.println("Enter the " + (row + 1) + " row of cards:");

    String userRowInput = scanner.nextLine();
    String[] userRowInputByColumns = userRowInput.trim().split(" ");

    if (userRowInputByColumns.length == AntiNoirConfig.columns) {
      return userRowInputByColumns;
    } else {
      System.out.printf(
        "Incorrectly entered string, number of items = %s , number columns config = %s\n",
        userRowInputByColumns.length,
        AntiNoirConfig.columns
      );
      return readNextRow(row);
    }
  }

  public String readCurrentCharacter() {
      return scanner.nextLine().trim();
  }
}
