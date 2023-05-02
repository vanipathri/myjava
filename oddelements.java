public class oddelements {
    public static void main(String[] args){
        int[] a={21,22,23,24,25};
        oddelements(a);
    }
    public static void oddelements(int[] arr1){

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]%2==1){
                System.out.println("odd element is "+ arr1[i]);
            }
        }

    }
        }