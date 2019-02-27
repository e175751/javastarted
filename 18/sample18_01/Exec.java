package sample18_01;
//import sampel17_01.*;
public class Exec{
  public static void main(String[] args) {
    Member member = new Student(118,"田中征","A110");
    System.out.println(member.getId()+"/"+member.getName());
  }
}
