package sample16_04;
import java.util.*;
import static java.lang.Math.pow;
public class Exec{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int hankei = scan.nextInt();
    System.out.println("面積"+pow(hankei,2)*3.14);
  }
}
