package ca219.LinearRecursion;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int [] numbers = {2 , 6 , 10 , 10};
        System.out.println(LinearSum(numbers , numbers.length-1));
        System.out.println(sumOfArray(numbers));
     }
    static int LinearSum(int[] data ,int n){
        if( n == 0)
            return data[n];
        else
            return data[n] + LinearSum( data , n-1 );
    }

    //looop
    static int sumOfArray(int data[] ){
        int result =0;
        for(int i=0; i<data.length; i++){
            result += data[i];
        }
        return result;
    }
}
