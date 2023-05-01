public class evenoddwithreturntype{
public static void main(String[] args){
    boolean result;

    result =evenodd(24);
    System.out.println(result);
    if (result == true) {
        System.out.println("Number is even");
    }
    else
        System.out.println("Number is odd");
}
  public static boolean evenodd( int x ){
    if (x%2==0){
        System.out.println("number is even");
        return true;
    }


    else {
        System.out.println("number is odd");
        return false;
    }
  }

}
