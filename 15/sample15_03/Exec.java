package sample15_03;
import java.util.*;
public class Exec{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double[] data = new double[5];
    for(int i=0;i<data.length; i++){
      System.out.print("値は");
      data[i] = scan.nextInt();
    }
    String list = Arrays.toString(data);
    System.out.println(list);
  }
}
