package ca218;

public class factorial {
    public static void main(String[] args) {
      printMessage("Welcome to java!" , 10);
    }
    //loop
    static int factorialWithLoop(int number){
        int result = 1;
        for(int i = number; i >= 1; i--){
            result *= i;
        }
        return result;
    }

    //recursion
    static int factorialWithRecursion(int number){
        if(number == 0)  //base case 1
            return 1;
        else if(number == 1)  //base case 2
            return 1;
        else  //recursive case
            return number * factorialWithRecursion(number - 1);
    }

    //print welocme messgae 5 times
    static void printMessage(String msg , int times){
        if(times == 1) // base case
            System.out.println(msg);
        else {
            System.out.println(msg);
            printMessage(msg, times - 1); // recursive case
        }
//        for(int i = 0; i < times; i++){
//            System.out.println(msg);
//        }
    }
}
