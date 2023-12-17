package ca218.LinearRecurison;

public class recursivepower {
    public static void main(String[] args) {
        System.out.println(powerFunction(2 , 5));
    }
    static double power(double x , double n){
        if( n == 0)
            return 1;
        else
            return x * power(x , n-1 );
    }

    static double powerFunction(double x , double n){
        double result=1;
        for(int i=1; i<=n; i++){
            result *= x ;
        }
        return result;
    }
}
