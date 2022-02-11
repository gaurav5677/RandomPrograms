import java.util.Scanner;

public class primeOrNot {
    // so now we need to find whether the give num is prime or not    n% div == 0 not prime

    public static void Prime( int c ){
     int div = 2;
     boolean isPrime = true;
     while ( div <=c/2){
         if (c % div == 0) {
             System.out.println(" compostie");
             return;
         }
         div +=1;
        }
        System.out.println(" prime");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int x = s.nextInt();
     Prime(x);
    }
}
