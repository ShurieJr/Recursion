package ca2110;

public class message {
    public static void main(String[] args) {
    printMessageLoop("WELCOME TO JAVA!" , 4);
    }

    //print message - Recursion
    static void printMessageF(String msg , int times){
        if(times == 1)
            System.out.println(msg);
        else
        {
            System.out.println(msg);
            printMessageF(msg, times - 1);
        }
    }

    //print message - Loop
    static void printMessageLoop(String msg , int times){
        for(int i=1; i <= times; i++ ){
            System.out.println(msg);
        }
    }
}
