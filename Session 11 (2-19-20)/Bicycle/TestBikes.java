package Bicycle;

public class TestBikes {
  public static void main(String[] args){
    testBikeMethods();
    testMountainBikeMethods();
  }

  private static Bike createBike(){
    return new Bike(5, 1);
  }

  private static Bike createMountainBike(){
    return new MountainBike();
  }

  private static void testBikeMethods(){
    Bike b1 = createBike();
    Bike b2 = createMountainBike();

    System.out.println("---------------------------");
    System.out.println("Test Bike Methods");
    System.out.println("---------------------------");
    System.out.println("B1: "+ b1);
    System.out.println("B2: "+ b2);
    System.out.println();
    System.out.println("Test speedUp B1, slowDown B2");
    b1.speedUp();
    b2.slowDown();
    System.out.println("B1: "+ b1);
    System.out.println("B2: "+ b2);
    System.out.println();
    System.out.println();
    System.out.println("Test changeRearGear, B1 & B2");
    System.out.println("B1: "+b1.changeRearGear('+'));
    System.out.println("B2: "+b2.changeRearGear('-'));
    System.out.println("B1: "+ b1);
    System.out.println("B2: "+ b2);
  }

  private static void testMountainBikeMethods(){
    System.out.println();
    System.out.println("---------------------------");
    System.out.println("Test Mountain Bike Methods");
    System.out.println("---------------------------");

    MountainBike mountainBike = (MountainBike)createMountainBike();

    System.out.println(mountainBike);
    System.out.println(mountainBike.changeFrontGear('+'));
    System.out.println(mountainBike);
  }
}
