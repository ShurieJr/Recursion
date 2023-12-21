package ca214.IndirectRecursion;

public class indirect {
    public static void main(String[] args) {
        print1(10);
    }
//    static void printN(int number){  //direct recursion
//        if(number ==  1)
//            System.out.println(number);
//        else{
//            System.out.println(number);
//            printN(number - 1 );
//        }
//    }

    static void print1(int number){  //indirect recursion
        if(number ==  1)
            System.out.println(number);
        else{
            System.out.println(number);
            print2(number - 1 );
        }
    }
    static void print2(int number){  //direct recursion
        if(number ==  1)
            System.out.println(number);
        else{
            System.out.println(number);
            print3(number - 1 );
        }
    }
    static void print3(int number){  //direct recursion
        if(number ==  1)
            System.out.println(number);
        else{
            System.out.println(number);
            print1(number - 1 );
        }
    }
}
