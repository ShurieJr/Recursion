package ca218;

public class sum {
    public static void main(String[] args) {
        System.out.println("sum(3): " + sumWithLoop(3));
        System.out.println("sum(3): " + sumFactorial(3));
    }

    static int sumFactorial(int number){
        if(number == 1 )
          return 1;
        else
            return number + sumFactorial(number - 1);
    }

    //loop
    static int sumWithLoop(int number){
        int result=0;
        for(int i =number; i >=1 ; i--){
            result =result + i;
        }
        return result;
    }
}
