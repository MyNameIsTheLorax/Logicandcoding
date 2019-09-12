//Iteration_Explore.java

/**
 * Lab that explores for loops.
 *
 * @author Roy Chancellor
 * @version 2/7/2019
 */
public class Iteration_Explore
{
    public static void main( String[] args) {
        int sumInt, square;
        
        System.out.println();  //blank line for separation in terminal
        System.out.println("i\tsumInt\tsquare i");  //table header
        
        sumInt = 0;
        for(int i = 100; i <= 1000; i += 25) {
            sumInt += i;
            square = i * i;
            System.out.println(i + "\t" + sumInt + "\t" + square);
        }  //end for
        
        int Factorial;
        
        System.out.println();
        System.out.println("j\tFactorial");
        //your for loop for the factorial will begin on the next line
        Factorial=1;
        for(int j = 1; j <= 10; j ++) {
            Factorial *= j;
            System.out.println(j + "\t" + Factorial);
        }
    } //end main
}  //end Iteration_Explore