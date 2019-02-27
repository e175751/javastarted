package sample17_01;
public class Exec{
  public static void main(String[] args) {
    Student stuMember = new Student(110,"中田京","A117");
    System.out.println(stuMember.getId()+"/"+stuMember.getName()+"/"+stuMember.getStudentID());
  }
}
