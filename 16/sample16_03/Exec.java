package sample16_03;
//import sample16_01.*;
public class Exec{
  public static void main(String[] args) {
    sample16_01.Dice dice = new sample16_01.Dice();
    dice.play();
    System.out.println("目数=" + dice.getVal());
  }
}
