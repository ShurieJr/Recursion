package ca2110.IndirectRecursion;

public class IndirectR {
    public static void main(String[] args) {
    odd(5);
    }

    static void print1(int number){
        if(number == 1)  //base case
            System.out.println(number);
        else{
            System.out.println(number);
            print2(number - 1); // recursive call
        }
    }
    static void print2(int number){
        if(number == 1)  //base case
            System.out.println(number);
        else{
            System.out.println(number);
            print3(number - 1); // recursive call
        }
    }
    static void print3(int number){
        if(number == 1)  //base case
            System.out.println(number);
        else{
            System.out.println(number);
            print1(number - 1); // recursive call
        }
    }

    static void odd(int number){
        if(number <=0 )
            return;
        else{
            if(number % 2 != 0)
                System.out.println(number + " odd ");
            even(number);
        }


    }
    static void even(int number){
        if(number <=0 )
            return;
        else{
            if(number % 2 == 0)
                System.out.println(number + " even ");
            odd(number-1);
        }

    }

}
