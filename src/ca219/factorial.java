package ca219;

public class factorial {
    public static void main(String[] args) {
        System.out.println("F(5 recursion) : " + factorial(5));
        System.out.println("F(5 loop) : " + factorailWithLoop(5));
    }

    public static int factorial(int num){
        //Base case  -- non-recursive part
        if(num == 0)
            return 1;
        else if (num == 1)
            return 1;
        //recursive case
        else
            return num * factorial(num - 1 );
    }
    public static int factorailWithLoop (int num){
        int result=1;
        for(int i = 1; i<= num; i++){
            result = result * i;
        }
        return result;
    }
}
