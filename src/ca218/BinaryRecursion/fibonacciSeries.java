package ca218.BinaryRecursion;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("fib(5) : " + fiboncci(5) );
        System.out.println("fib(6) : " + fiboncci(6) );
        System.out.println("fib(3) : " + fiboncci(3) );
    }

    static int fiboncci(int index){  //binary , Direct recursion
        if(index <= 1)  // 2 base cases
            return index;
        else
            return fiboncci(index -1 ) + fiboncci(index-2);
    }
}
