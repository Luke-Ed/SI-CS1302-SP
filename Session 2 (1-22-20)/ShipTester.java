public class ShipTester{
  public static void main(String[] args) {

  }
  public static Ship createShip(){
    Ship s1 = new Ship("Salty Dog", 54.2, 52, "pink", "battleship");
    return s1;
  }

  public static void testGetters(){
    Ship s1 = createShip();
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Test getType: expected:\"battleship\", received:\"%s\"\n", s1.getType()));
    sb.append(String.format("Test getSpeed: expected:\"54.2\", received:\"%f\"\n", s1.getSpeed()));
    sb.append(String.format("Test getTankSize: expected:\"52\", received:\"%d\"\n", s1.getTankSize()));
    sb.append(String.format("Test getName: expected:\"Salty Dog\", received:\"%s\"\n", s1.getName()));
    sb.append(String.format("Test getColor: expected:\"battleship\", received:\"%s\"\n", s1.getColor()));
    System.out.println(sb);
    s1 = null;
  }

  public static void testSail(){
    Ship s1 = createShip();
    System.out.println(String.format("Test sail: Expected\nShip Salty Dog sailed 201.56 miles, this took 3.7188 hours. \nReceived:\n%s", s1.sail(201.56)));

  }

  public static void searchShips(){
    Ship[] ships = new Ship[3];
    ships[0] = createShip();
    ships[1] = new Ship("Queen", 46, 30, "purple", "sailBoat");
    ships[2] = new Ship("King", 70, 90, "royalBlue", "speedBoat");
    
    Ship s1 = new Ship("Salty Dog");
    for(Ship s : ships){
      if(s.getName()==s1.getName()){
        System.out.println("Found it");
      }
    }
    
    Ship s2 = new Ship("King");
    for(Ship s : ships){
      if(s.getName()==s2.getName()){
        System.out.println("Found it");
      }
    }

    Ship s3 = new Ship("HSS Perfect");
    for(Ship s : ships){
      if(s.getName()==s1.getName()){
        System.out.println("Found it");
      }
    }
  }
}