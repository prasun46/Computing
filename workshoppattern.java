
/**
 * Write a description of class workshoppattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshoppattern
{
    public static void main(String[] args){
        int s=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j>=i;j--){
                System.out.println();
            }
                for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}