import java.util.Arrays;
import java.util.Scanner;

public class PrimeSieve2{
    public static boolean[] sieve = new boolean [1000];
    public static int[] primes = new int [1000];
    
public static void printPrimeFactors(){
 
 boolean stop=true;
 while(stop){
 System.out.println("Type a integer greater than 1");
 Scanner scan = new Scanner(System.in); 
 int input=scan.nextInt(); 
 if (input>1) {
        int n=0;
        int i;
        int[] answers = new int [1000]; //set new array with 1000 positions
        int remainder=input;
        
        Arrays.fill(answers, 0); //set all entries to 0
        for (i=0; i<=primes.length; i++){ //increase denominater by one if number is not divisible
            while (remainder%primes[i]==0){ //while the user input is perfectly divisible by a prime number,
                answers[i]=answers[i]+1; //then increases number at position by 1
                remainder=remainder/primes[i]; //remainder of numerator divided by prime number
                if (remainder==1){ //if remainder is 1 because number is divided by itself
                    break;
                }
                }
                if (remainder==1){
                break;
            }
            }
            System.out.println("Prime factorization of " + input); 
            for (i=0; i<answers.length; i++){ //for length of 1000
                if (answers[i]!=0){ //if number at position is not 0
                    System.out.println(primes[i] + ": " + answers[i]); //then print prime and how many times it goes in it
                }
            }
     System.out.println("Do you want to run again? Type true.");
     Scanner Bob = new Scanner(System.in);
     boolean resume=Bob.nextBoolean();
     if (resume==true) { 
         stop=true;
     }
     else {
         stop=false;
    }
}
 else {
     System.out.println("Invalid input. Please re-enter");
 stop=true;
}
}
}

    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false; 
        sieve[1] = false; //sets 0 and 1 = false
        int n;
        int i;
        int j=0;
        for (i=2; i<=sieve.length-1; i++){  //increase denominater by one after every loop
          for (n=i+1; n<=sieve.length-1; n++){ //going through every number greater than i
            if (n>i){
                if(n%i==0){ //if number perfectly divisible by denominater
                  sieve[n]=false; //sets any number divisible by i to false
                }
            }
           }
        } 
        for (i=0; i<=sieve.length-1; i++){ //counts how many prime numbers there are
            if(sieve[i]==true){ //if sieve[i] is a prime number,
                System.out.println(i); //then you print out those prime numbers
                primes[j]=i; //prime numbers are loaded into primes array
                j++; //increase position of prime number
            }
        }
    /*collectPrimes is its own method, using the info from changed universal 
     *sieve[]  
     *printPrimeFactors is then a second method, using info from collectPrimes
     */
    printPrimeFactors(); //calling on method printPrimeFactors
}

}
