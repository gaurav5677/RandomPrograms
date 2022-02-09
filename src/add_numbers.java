import java.util.Scanner;

public class add_numbers {
//    so lets make the function first for the addition
   public  static long add( int n , int x){
       return n+x;// here instead of initializing another variable for storing the value we can directily return the ans to
       //the function
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println(" Enter the number" );
        int c = s.nextInt() ;
        int p = s.nextInt();
        long g= add(c ,p);// this is how we set the values for the function , and call the function
        System.out.println(g);//here we call long g which contains the ans .
    }
}
