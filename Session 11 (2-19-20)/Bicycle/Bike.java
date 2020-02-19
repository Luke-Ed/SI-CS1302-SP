package Bicycle;

public class Bike {
  protected int rearGear;
  protected int currentRearGear;
  protected int speed;

  public Bike(int rearGear, int speed) {
    this.rearGear = rearGear;
    this.speed = speed;
    currentRearGear = 1;
  }

  public void speedUp(){
    speed++;
  }

  public void slowDown(){
    speed--;
  }

  public String changeRearGear(char c){
    if (c == '+'){
      currentRearGear += 1;
      return "Rear gear changed to " + currentRearGear;
    }
    else if (c == '-') {
      currentRearGear -= 1;
      return "Rear gear changed to " + currentRearGear;
    }
    else{
      return "Invalid character";
    }
  }

  @Override
  public String toString() {
    return "Bike {" + "rearGear=" + rearGear + ", currentRearGear=" + currentRearGear + ", speed=" + speed + " }";
  }
}
