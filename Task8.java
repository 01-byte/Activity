import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [] parameters = {4,5,10}; 
        summation(parameters);
        

    }

    static void summation(int[]numbers) {
        int sum = 0 ; 
        for ( int number : numbers) { 
            sum +=  number ;
            
        }
      System.out.println("Summation is " + sum);

    }

}
