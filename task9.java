import java.lang.Math.*;


public class task9 {
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Sum is " + add(a, b));
        System.out.println("Difference is " + sub(a, b));
        System.out.println("Product is " + multiply(a, b));
        System.out.println("Qoutient is " + divide(a, b));
    }
    public static int add(int a , int b) {
        int result = Math.addExact(a, b);
        return result;
    }
     
    public static int sub(int a , int b) {
       int result = Math.addExact(a, b);
        return result;
    }

     
    public static int multiply(int a , int b) {
        int result = Math.addExact(a, b);
        return result;
    }

     
    public static float divide(int a , int b) {
        int result = Math.floorDiv(a, b);
        return result;
    }





}
