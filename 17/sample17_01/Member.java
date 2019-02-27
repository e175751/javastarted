package sample17_01;
public class Member{
  private int id;
  private String name;

  public Member(int id, String name){
    this.id = id;
    this.name = name;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public static void main(String[] args) {
    Member member = new Member(119,"田中敬語");
    System.out.println("number="+member.getId()+"/name="+member.getName());

  }
}
