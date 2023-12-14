package ca214;

public class message {
    public static void main(String[] args) {
        printMessage("WELCOME TO JAVA" , 5);
//        System.out.println("---------------------");
//        for(int i=1; i<=5; i++){
//            System.out.println("WELCOME TO JAVA");
//        }

    }

    static void printMessage( String msg , int times){
        if(times == 1)
            System.out.println(msg);
        else {
            System.out.println(msg);
            printMessage(msg, times - 1);
        }
    }
}
