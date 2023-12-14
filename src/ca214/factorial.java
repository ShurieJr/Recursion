package ca214;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial (4) : "  + factorial(4));
        System.out.println("Factorial (3) : "  + factorial(3));
        System.out.println("Factorial (5) : "  + factorial(5));
    }

    //factorial - recursion
    static int factorial(int number){
         if(number == 1) //2 base case
            return 1;
        else  //recursive case
            return number * factorial( number - 1 ) ;
    }

    //factorial - loop
    static int factorialWithLoop(int number){
        int result=1;
        for(int i=1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
}
