package sample14_03_1;
public class Exec{
  String color;
  int val;
  public Dice(int val, String color){
    this.val = val;
    this.color = color;
  }
  public Dice(String color){
    Dice(1,color);
  }
  public Dice(){
    Dice(1,"白");
  }
}
