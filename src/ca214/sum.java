package ca214;

public class sum {
    public static void main(String[] args) {
        System.out.println("sum(4): " + sum(4));
        System.out.println("sum(5): " + sum(5));
        System.out.println("sum(6): " + sum(6));
    }
    static int sum(int number){
        if(number == 1 )
            return 1;
        else
            return number + sum( number - 1);
    }
}
