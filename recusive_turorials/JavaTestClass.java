import java.util.Scanner
public class JavaTestClass {
  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    int n = 10, firstNum = 0 , secondNum = 1;
    int nextNum;

    for(int i=1;i<=n;i++){
      System.out.print(firstNum + " ,");
       nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    } 
  }
  sccaner.close();
}
