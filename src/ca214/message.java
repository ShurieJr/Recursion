package ca214;

public class message {
    public static void main(String[] args) {
        printMessage("WELCOME TO JAVA" , 5);

        int times = 5;
        String msg = "WELCOME TO JAVA";
        System.out.println("---------------------");
        for(int i=1; i<=times; i++){
            System.out.println(msg);
        }

    }

    static void printMessage( String msg , int times){
        if(times == 1) // base case
            System.out.println(msg);
        else {  //recursive case
            System.out.println(msg);
            printMessage(msg, times - 1);
        }
    }
}
