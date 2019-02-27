package sample18_05;
public class Member{
  private int id;
  private String name;
  public Member(int id, String name){
    this.id = id;
    this.name = name;
  }
  @Override
  public String toString(){
    return "Student [id="+studentID+"]";
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
}
