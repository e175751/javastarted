package sample14_04;
public class Exec{
  public static void main(String[] args) {
    Dice dice1 = new Dice(4,"黒");
    Dice dice2 = new Dice("赤");
    Dice dice3 = new Dice();
    System.out.println("dice1="+dice1.val+"と"+dice1.color);
    System.out.println("dice2="+dice2.val+"と"+dice2.color);
    System.out.println("dice3="+dice3.val+"と"+dice3.color);
  }
}
