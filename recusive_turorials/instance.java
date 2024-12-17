public class instance{
  public static void main(String[] args) {
    public String A(){
      return "hello" + B();
    }
    public String B(){
      return "my" + C();
    }
    public String C(){
      return "friends" + C();
    }
  }
}