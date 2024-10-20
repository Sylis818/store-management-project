public class Apple extends Fruits {
  String color;

  public Apple() {
    super();
    this.color = "default";
  }

  public Apple(String name, double weight, String color) { //constructor for apple
    super(name, weight);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String colorUpdate) {
    color = colorUpdate;
  }

  public String toString() {
    String text = "Product: Apple\n";
    text += super.toString();
    text += ", Color: " + color;
    return text;
  }
}