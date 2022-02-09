import java.util.Scanner;

public class EvenAndOdd {
    //how we check a number is even or odd by simply diving it by 2 .
//    so lets make a function which will check whether the given number is even or odd
    public static void check(int x){
        if( x% 2 !=0){
            System.out.println("odd ");
        }else{
            System.out.println("even ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        check(c );
    }

}


