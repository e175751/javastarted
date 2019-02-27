package sample17_02;
class Data{
  public Data(){
    System.out.println("Data class");
  }
}

class BigData extends Data{
  public BigData(){
    System.out.println("BigData class");
  }
}

class ManyBigData extends BigData{
  public ManyBigData(){
    System.out.println("ManyBigData class");
  }
}

public class Test{
  public static void main(String[] args) {
    ManyBigData mbd = new ManyBigData();
  }
}
