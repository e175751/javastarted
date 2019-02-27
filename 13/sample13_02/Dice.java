package sample13_02;
public class  Dice {
  int val;
  public void play(){
    val = (int)(Math.random()*6) + 1;
  }
}
