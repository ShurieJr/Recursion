package ca214.BianryRecursion;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("f(3) : " + fibonacci(3));
        System.out.println("f(4) : " + fibonacci(4));
        System.out.println("f(5) : " + fibonacci(5));
        System.out.println("f(10) : " + fibonacci(10));
    }

    static int fibonacci(int number){
        if (number <= 1) // base case
            return number;
        else  //recursive call
            return fibonacci(number -2 ) + fibonacci(number -1 );

    }
}
