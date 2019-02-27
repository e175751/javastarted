package sample14_03_1;
public class Dice{
  int val;  //目数
  String color;  //サイコロ色
  public Dice(int val, String color){
    this.val = val;
    this.color = color;
  }
  public Dice(String color){
    this.val = 1;
    this.color = color;
  }
  public Dice(){
    this.val = 1;
    this.color = "白";
  }
}
