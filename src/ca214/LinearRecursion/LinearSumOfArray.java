package ca214.LinearRecursion;

public class LinearSumOfArray {
    public static void main(String[] args) {
        int data[] = { 20 , 30 , 40 , 10 };
        System.out.println("Linear sum : " + linearaSum(data , data.length-1));
        //loop
//        int result = 0;
//        for(int i=0; i< data.length; i++){
//            result += data[i];
//        }
//        System.out.println("result (loop) : " + result);
    }
    static int linearaSum(int [] data , int index){
        if(index == 0)
            return data[index];
        else
            return data[index] + linearaSum(data , index-1);
    }
}
