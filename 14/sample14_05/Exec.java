package sample14_05;
public class Exec{
  public static void main(String[] args) {
    Dice dice = new Dice();
    //dice.play();
    dice.setVal(6);
    dice.setColor("赤");
    dice.play();
    System.out.println("dice.getVal="+dice.getVal());
    System.out.println("dice.getColor="+dice.getColor());
  }
}
