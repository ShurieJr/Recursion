package ca218.IndirectRecursion;

public class indirectDemo {
    public static void main(String[] args) {
        print1(6);
    }
    //direct recursion
    static void printN(int number){  //6 , 5 , 4 , 3 , 2 ,1
        if(number == 1)  // base case
            System.out.println(number);
        else {
            System.out.println(number);
            printN(number - 1 );  // recursive call
        }

    }

    //indirect recursion
    static void print1(int number){  //6 , 5 , 4 , 3 , 2 ,1
        if(number == 1)  // base case
            System.out.println(number);
        else {
            System.out.println(number);
            print2(number - 1 );  // recursive call
        }
    }
    static void print2(int number){  //6 , 5 , 4 , 3 , 2 ,1
        if(number == 1)  // base case
            System.out.println(number);
        else {
            System.out.println(number);
            print3(number - 1 );  // recursive call
        }
    }

    static void print3(int number){  //6 , 5 , 4 , 3 , 2 ,1
        if(number == 1)  // base case
            System.out.println(number);
        else {
            System.out.println(number);
            print1(number - 1 );  // recursive call
        }
    }

}
