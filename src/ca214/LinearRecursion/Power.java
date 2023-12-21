package ca214.LinearRecursion;

public class Power {
    public static void main(String[] args) {
        System.out.println("power(2,3): " + powerRecursion(2 ,3));
        System.out.println("power(2,10): " + powerRecursion(2 ,10));
    }
    //linear recursion
    static double powerRecursion(double x , double n){
        if(n == 0 )
            return 1;
        else
            return x * powerRecursion(x , n-1);
    }

}
