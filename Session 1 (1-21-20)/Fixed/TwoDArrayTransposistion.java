package example1;

public class TwoDArrayTransposistion {
  private static int[][] createArray(){
    int[][] randomArray = new int[5][5];
      for (int i=0; i<randomArray.length; i++){
        for (int j=0; j<randomArray[i].length; j++){
          randomArray[i][j] = (int)(Math.round((Math.random()*100)));
        }
      }
    return randomArray;
  }

  private static void printArray(int[][] array){
    for (int[] i : array){
      for (int j : i){
        System.out.print(j + "\t");
      }
      System.out.println();
    }
  }

  private static int[][] transposeArray(int[][] array) {
    int[][] transposedArray = new int[5][5];
    for (int i= 0; i<transposedArray.length; i++) {
      for (int j = 0; j < transposedArray.length; j++) {
        transposedArray[j][i] = array[i][j];
      }
    }
    return transposedArray;
  }

  public static void main(String[] args) {
    int[][] randomArray = createArray();
    System.out.println("Randomly Generated Array");
    printArray(randomArray);
    System.out.println("\nTransposed Array");
    printArray(transposeArray(randomArray));
  }
}
