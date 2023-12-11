package ca219;

public class sum {
    public static void main(String[] args) {
        System.out.println("sum(4) : " + sum(4));
    }

    public static int sum(int num){
        int result;
        //base case
        if(num == 1)
            result = 1 ;
        else // recursive case
            result = num + sum(num - 1 );

        return result;
    }
}
