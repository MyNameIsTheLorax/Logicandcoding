/**
 * Skeleton code
 * 
 * @author Roy Chancellor
 * @ersion 3/15/2019
 */
import java.util.Scanner;
public class knock_knock
{
    public static void main( String args[] ) {
        int q=0;
        outerLoop:
        while(q == 0){
            System.out.println("Knock, Knock");
            System.out.println("Who's there");
            Scanner pineapple = new Scanner(System.in);
            String papaya = pineapple.nextLine();
            if (papaya.equalsIgnoreCase("banana")){
                System.out.println("Banana who?");
            }
            else if (papaya.equalsIgnoreCase("orange")){
                System.out.println("Orange you glad you didn't type banana?");
                break outerLoop;
            }
            else {
                System.out.println("You're not playing my game very well");
            }
        }
    }
}