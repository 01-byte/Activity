import java.util.*;


public class task5{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    List<Integer> nums = new ArrayList<>();
    int number; 
    System.out.println("Input First number : ");
    number= scan.nextInt();
    nums.add(number);
    System.out.println("Input Second number : ");
    number= scan.nextInt();
    nums.add(number);
    System.out.println("Input Third number : ");
    number= scan.nextInt();
    nums.add(number);
    
    Collections.sort(nums);

     int greatest = nums.get(2);

        if (nums.get(0).equals(nums.get(1)) || nums.get(1).equals(nums.get(2)) || nums.get(0).equals(nums.get(2))) {
            System.out.println("There is/are equal value(s) among the inputs.");
        }

        
        

        else{
             System.out.println("The greatest number is: " + greatest);
        }



    }


    }

