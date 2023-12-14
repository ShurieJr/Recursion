package ca2110;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial(1) : " + factorialRecursion(1));
        System.out.println("Factorial(0) : " + factorialRecursion(0));
        System.out.println("Factorial(3) : " + factorialRecursion(3));
    }

    //factorial - RECURSION
  static int factorialRecursion(int number){  //recursive method
        if(number == 0)  //base case
            return 1;
        else   //recursive case
            return number * factorialRecursion( number - 1 );
    }
    //factorial -Loop
    static int factorialLoop(int number){
        int result =1;
        for(int i = 1; i <= number; i++){
            result =result *  i;
        }
        return result;
    }
}
