package sample15_05;
public class Exec{
  public static void main(String[] args) {
    Dice[] dices = {new Dice(), new Dice(), new Dice()};
    for(Dice dice : dices){
      System.out.println(dice.getVal() + "/" + dice.getColor() + "\t");
    }
  }
}
