package ca2110.linearRecursion;

public class linearsum {
    public static void main(String[] args) {
        int numbers[] = {10 , 20 , 40 , 100};
        System.out.println(linearsumRecursion(numbers , numbers.length-1 ));
    }
    static int linearsumRecursion(int[] data , int index){
        if(index == 0)
            return data[0];
        else
            return data[index] + linearsumRecursion(data, index-1);
    }
}
