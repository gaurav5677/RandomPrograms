import java.util.Scanner;

public class factors {
    //so now we are goint to make a program which will give us the factors of the give number other than 1 and
//    the number itself
    public static void fact( int num){
        int i = 2 ;
        while ( i<=num/2){
            if( num% i ==0){
                System.out.print(i+" ");
            }
            i +=1;
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n = s.nextInt();
        fact(n );
        }
    }

