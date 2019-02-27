package sample14_04;
public class Dice{
  int val;
  String color;
  public Dice(int val, String color){
    this.val = val;
    this.color = color;
  }
  public Dice(String color){
    this(1,color);
  }
  public Dice(){
    this(1,"白");
  }
  public void play(){
    val = (int)(Math.random()*6) + 1;
  }
}
