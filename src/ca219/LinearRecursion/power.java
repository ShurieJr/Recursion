package ca219.LinearRecursion;

public class power {
    public static void main(String[] args) {
        System.out.println("pow(2 , 3) R : " + pow(2,3));
        System.out.println("pow(2 , 3) L : " + powerFunction(2,3));
    }
    //recursion
    static double pow(double x , double n){
        if(n == 0)
            return 1;
        else
           return x * pow(x , n-1);  // linear recursion
    }

    //loop
    static double powerFunction(double x , double n){
        double result=1;
        for(int i=1; i<=n; i++){
            result *= x ;
        }
        return result;
    }
}
