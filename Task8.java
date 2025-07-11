import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        cummulativeSum(4,5,10);
    }

    static void cummulativeSum (int ... numbers){
        int sum = 0;
        for (int number : numbers){
           sum += number;
        }
        System.out.println(sum);
    }

}
