import java.util.Scanner;

public class task4{


    
public static void main(String[] args) {


    String name;
    Scanner scan = new Scanner (System.in);
    StringBuilder palindromeName = new StringBuilder();
    StringBuilder palindromeReversed = new StringBuilder();
    System.out.print("Please enter the string : ");
    name = scan.nextLine();
    palindromeName.append(name);
    StringBuilder reversedPalindrome = new StringBuilder(name).reverse();
    
    

    if (palindromeName.toString().equals(reversedPalindrome.toString())){
        System.out.println("The input string is Palindrome");
    }
    else
     System.out.println("The input string is not a Palindrome");






}

}