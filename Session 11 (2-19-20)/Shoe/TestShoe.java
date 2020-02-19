package Shoe;

public class TestShoe {
  public static void main(String[] args){
    testShoeMethods();
  }

  private static Shoe createShoe(){
    return new Shoe("Irish Setter", "Brown", "Leather", 2010248592);
  }

  private static Shoe createSneaker(){
    return new Sneaker("Nike", "Black", "Cloth", 2029382822);
  }

  private static void testShoeMethods(){
    Shoe s1 = createShoe();
    Shoe s2 = createSneaker();

    System.out.println("----------------------");
    System.out.println("Test Shoe Methods");
    System.out.println("----------------------");
    System.out.println("S1: " + s1);
    System.out.println("S2: " + s2);

  }
}
