
import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("x-coordinate:");  //prompt the user for an x-coordinate
        x = keys.nextDouble();
        System.out.println("y-coordinate:");  //prompt the user for a y-coordinate
        y = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if (x>0 && y>0) {
            System.out.println("Your point is in quadrant 1");
        }
        else if (x<0 && y>0) {
            System.out.println("Your point is in quadrant 2");
        }
        else if (x<0 && y<0) {
            System.out.println("Your point is in quadrant 3");
        }
        else if (x>0 && y<0) {
            System.out.println("Your point is in quadrant 4");
        }
        //output the result to the user
    }
}