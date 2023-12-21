package ca2110.linearRecursion;

public class Power {
    public static void main(String[] args) {
        System.out.println("power(2,3): " + power(2 , 3));
        System.out.println("power(2,10): " + power(2 , 10));
    }
    static double power(double x , double n){
        if(n == 0)
            return 1;
        else
            return x * power(x , n-1);
    }
}
