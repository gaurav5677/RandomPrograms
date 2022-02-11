import java.util.Scanner;

public class PrimeNumberstillN {
    public static void printprime( int x ){



//         code
        for( int i =1 ; i<=x;i++){
            int count = 0;

            for( int div=2 ;div*div<=i ;div++ ){
                if( i % div ==0){
                    count++;
                    break;
                }

            }
            if(count==0){
                System.out.println(i );
            }

            }


        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        printprime(num);
        }
    }


