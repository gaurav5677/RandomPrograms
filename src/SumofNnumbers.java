import java.util.Scanner;

public class SumofNnumbers {
//    so in this question we are going to find the sum of all the numbers till n
    public static int SumtillN( int n ){
        int sum = 0 ;
        for( int i = 0 ; i<= n ;i++){
            sum = sum+i;

        }
        return sum ;//here the sum value will be return to the function;

    }

    public static void main(String[] args) {
        Scanner s  = new Scanner( System.in);
        int c = s.nextInt();
        System.out.println(SumtillN(c));
    }

}
