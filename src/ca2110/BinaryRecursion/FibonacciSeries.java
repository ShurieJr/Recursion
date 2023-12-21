package ca2110.BinaryRecursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("fib(0) : " + fibonacci(0)); //0
        System.out.println("fib(1) : " + fibonacci(1)); //1
        System.out.println("fib(2) : " + fibonacci(2)); //1
        System.out.println("fib(3) : " + fibonacci(3)); // 2
        System.out.println("fib(4) : " + fibonacci(4)); // 3
    }
    static int fibonacci(int index){
        if( index <= 1)
            return index;
        else
            return fibonacci(index - 2 ) + fibonacci(index-1);
    }
}
