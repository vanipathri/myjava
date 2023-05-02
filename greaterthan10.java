public class greaterthan10 {
    public static void main(String[] args){
        int[] myarray={9,12,34,8,1, 67};
        greaterthan10(myarray );


    }
    public static void greaterthan10(int [] arr1){
        for(int i=0;i<arr1.length; i++){
            if(arr1[i]>10){
                System.out.println("element greater than 10 is "+arr1[i]);

            }

        }
    }

}