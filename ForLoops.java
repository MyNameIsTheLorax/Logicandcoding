//Java class ForLoops.java

/**
 * Skeleton code for the for loops practice day.
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class ForLoops
{
    public static void main( String args []) {
        //variable declarations
        int i, cubed;
        System.out.println("i\tcubed");
        //for loop to perform the task
        for(i = 1; i <= 10; i++) {
            cubed = i * i * i;
            System.out.println(i + "\t" + cubed);
        }
        System.out.println();
        int odd;
        System.out.println("odd");
        for(odd = 99; odd >= 1; odd= odd - 2) {
            System.out.println(odd);
        }
        System.out.println();
        String a = "The quick brown fox jumped over the lazy dog";
        int p = a.length();
        
        a.charAt (0);
        for (int q = 0; q < p; q++) {
            System.out.println(a.charAt(q));
        }
            
        
    }   //end main
}   //end ForLoops class