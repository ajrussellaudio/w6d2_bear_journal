public class Chicken implements Edible {

  private int nutritionalValue;

  public String cluck() {
    return "Cluck cluck.";
  }

  public String swim() {
    return null;
  }

  public int nutritionalValue() {
    return 200;
  }
}

// liskov