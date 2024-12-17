public class class2 {
  public static void main(String[] args) {
    String binary = findBinary(223,"");
  }
  public static String findBinary(int decimal,String result){
    if(decimal == 0){
      return result;
    }
    result = decimal % 2 + result;
    return findBinary(decimal / 2 , result);
  }
}
