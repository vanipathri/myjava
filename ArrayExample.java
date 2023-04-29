public class ArrayExample {

    public static void SumofArrayElements(){
        int[] myarray = {1, 2, 3, 40};
        int sum=0;
        for (int i=0; i < myarray.length;i++){
             sum=sum+myarray[i];

        }
        System.out.println("SUm of array is "+ sum);
    }
    public static void main(String [] args){
        SumofArrayElements();
    }
}
