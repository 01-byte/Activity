package tasks;
import java.util.*;


public class task7{

    public static void main(String[] args){
          int a ; 
    int b ;
        task7 ml = new task7();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st number : ");
         a = scan.nextInt();
        System.out.print("Input 2nd number : ");
        b = scan.nextInt();

        System.out.println("sum is "+ ml.sum(a, b));
                System.out.println("difference is "+ ml.different(a, b));
                        System.out.println("product is "+ ml.product(a, b));
                                System.out.println("qoutient is "+ ml.qout(a, b));
    }
    
        int sum(int a ,int  b){
           return a + b ; 
        }
        int different(int a ,int  b){
           return(a-b);
        }
        int product(int a ,int  b){
           return(a*b);
        }
        float qout(int a ,int  b){
           return((a/b));
        }
    }
    
    
        

  
    
