package sample14_01;
public class Dice{
  int val;
  //コンストラクタ
  public Dice(int num){
    val = num;
  }
  public void play(){
    val = (int)(Math.random()*6) + 1;
  }
}
