package sample17_01;
public class Student extends Member{
  private String studentID;
  public Student(int id, String name, String studentID){
    super(id,name);
    this.studentID = studentID;
  }
  public double discount(){
    return 0.2;
  }
  public String getStudentID(){
    return studentID;
  }
}
