package ca219;

public class IndirectRecursion {
    public static void main(String[] args) {
        print1(10);
    }
//    static void printN(int N){  //Direct recursion
//        if(N == 1)
//            System.out.println(N);
//        else {
//            System.out.println(N);
//            printN(N-1);
//        }
//    }

    //indirect recursion
    static void print1(int N){
        if(N == 1)
            System.out.println(N);
        else {
            System.out.println(N);
            print2(N-1);
        }
    }
    static void print2(int N){
        if(N == 1)
            System.out.println(N);
        else {
            System.out.println(N);
            print3(N-1);
        }
    }

    static void print3(int N){
        if(N == 1)
            System.out.println(N);
        else {
            System.out.println(N);
            print1(N-1);
        }
    }
}
