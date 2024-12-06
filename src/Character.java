import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author FLIGHT
 */
public enum Character {
  FRIEND("Дружок"),
  KATRIN("Кэтрин"),
  CLIVE("Клайв"),
  MARION("Мэрион");

  private final String name;

  Character(String name) {
    this.name = name;
  }

  private static final Map<String, Character> nameToCharacter =
    Arrays.stream(values()).collect(Collectors.toMap(
      character -> character.getName().toLowerCase(),
      Function.identity()
    ));

  public String getName() {
    return name;
  }

  public static Character fromName(String name) {
    if (!nameToCharacter.containsKey(name.toLowerCase()))
      throw new IllegalArgumentException();

    return nameToCharacter.get(name.toLowerCase());
  }

  @Override
  public String toString() {
    return "{" + name + "}";
  }
}
