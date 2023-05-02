public class sumof2array{
    public static void main(String[] args){
      int[] arr1={1,2} ;
      int[] arr2={3,4};
      int result;
     result= sumoftwoarrays(arr1,arr2);
     System.out.println("sum of arrays is " +result);

    }
    public static int sumoftwoarrays(int[] x, int[] y){
        int sum=0;
        int sum1=0;
        //n {1,2,3,4}
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
            }
        for( int i=0;i<y.length; i++){
            sum1=sum1+y[i];

        }
        System.out.println(sum +" " + sum1);
        return sum+sum1;


    }
}