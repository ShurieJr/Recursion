package ca2110;

public class sum {
    public static void main(String[] args) {
        System.out.println("sum(4) : " + sumF(4));
        System.out.println("sum(4) loop : " + sumloop(4));
    }

    static int sumF(int number){  //recursive method
        if(number == 1)  //base case
            return 1;
        else   //recursive case
            return number + sumF( number - 1 );
    }
    static int sumloop(int number){  //recursive method
    int result =0;
        for(int i = 1; i <= number; i++){
        result =result +  i;
    }
        return result;
    }
}
