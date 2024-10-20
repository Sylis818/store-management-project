public class StoreRunner {
  public static void main(String[] args) {

    Fruits testFruits = new Fruits("Apple", 0.3);
    System.out.println(testFruits.toString());

    Apple testApple = new Apple("Green Apple", 0.4, "green");
    System.out.println(testApple.toString());
    System.out.println("\n"); 

    testApple.setWeight(0.4);
    testApple.setColor("green");
    System.out.println("Updated\n" + testApple.toString());
    System.out.println("\n"); 

    Melon testMelon = new Melon("Long Melon", 7.2, 4);
    System.out.println(testMelon.toString());

    testMelon.setWeight(7.2);
    testMelon.setLength(4.1);
    System.out.println("Updated\n" + testMelon.toString());
  }
}