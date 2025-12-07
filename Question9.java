import java.util.Scanner;
/**
 * Write a description of class Question9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question9{




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a positive integer : ");
        int originalNumber = scanner.nextInt();
        
        int Number = originalNumber; 
        int reversedNumber = 0; 
        
        
        while (Number != 0) {
            
            int digit = Number % 10; 
            
          
            reversedNumber = reversedNumber * 10 + digit;
            
         
            Number = Number / 10; 
        }
        
        
        System.out.println("\nOriginal Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        
        
    }
}