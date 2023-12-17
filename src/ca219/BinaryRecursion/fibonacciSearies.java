package ca219.BinaryRecursion;

public class fibonacciSearies {
    public static void main(String[] args) {
        System.out.println("f(6) : " + fibonacci(6));
        System.out.println("f(3) : " + fibonacci(3));
        System.out.println("f(0) : " + fibonacci(0));
    }
    static int fibonacci(int index){   //binary recursion
        if(index <= 1)
            return index;
        else  // recursive case
            return fibonacci(index -2 ) + fibonacci(index - 1);
    }
}
