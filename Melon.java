public class Melon extends Fruits {
  double length; 

  public Melon() {
    super();
    this.length = 0.0;
  }

  public Melon(String name, double weight, double length) { //constructor for melon
    super(name, weight);
    this.length = length;
  }

  public double getLength() { 
    return length;
  }

  public void setLength(double length) { 
    this.length = length;
  }

  public String toString() {
    String text = "Product: Size\n";
    text += "Name: " + super.getName() + ", Weight: " + this.getWeight();
    text += ", Length: " + length;
    return text;
  }
}