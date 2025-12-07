import java.util.Scanner;

/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String[] args){
        int i=1;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number= input.nextInt();
        for(i=1;i<=10;i++){
            int product=number*i;
            System.out.printf("%d*%d=%d%n",number,i,product);
        }
}
}