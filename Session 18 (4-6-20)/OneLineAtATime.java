package Monday;

import java.util.ArrayList;
import java.util.Random;

public class OneLineAtATime {
  public static void main(String[] args){
    ArrayList<Integer> randInt = new ArrayList<>();
    Random random = new Random(198418991);
    for(int i = 0; i < 10; i++){
      randInt.add(random.nextInt(100));
    }
    System.out.println(randInt);
    ArrayList<Integer> randInt2 = new ArrayList<>();
    for (int i=0; i<10; i++){
      int randomNum = (int) (Math.random() * ((100 - 20)+1)+20);
      randInt2.add(randomNum);
    }
    System.out.println(randInt2);
  }
}
