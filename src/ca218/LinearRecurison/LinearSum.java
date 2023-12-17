package ca218.LinearRecurison;

public class LinearSum {
    public static void main(String[] args) {
int []data = {4 , 10 , 25 ,90 ,100};
        System.out.println(sum(data , data.length-1));

        //loop
        int result = 0;
        for(int i=0; i< data.length; i++){
            result += data[i];
        }
        System.out.println("result (loop) : "+ result);
    }

    static int sum(int data[], int index){
        if(index == 0)
            return data[index];
        else
            return data[index] + sum(data , index-1 );
    }
}
