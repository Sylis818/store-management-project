public class Fruits {
  private String name;
  private double weight;

  public Fruits() {
    this.name = "";
    this.weight = 0.0;
  }

  public Fruits(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() { // returns the name
    return name;
  }

  public double getWeight() { //returns the weight
    return weight;
  }

  public void setName(String name) { 
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String toString() {
    String text = "Name: " + name + ", Weight: " + weight;
    return text;
  }

}