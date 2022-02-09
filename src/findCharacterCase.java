import java.util.Scanner;

public class findCharacterCase {

    //if the user give upper case  the print 1
//    if the user give lowercase then print 0
//    if the given character is not alphabet then print -1

    public static void Find( char x ){
        if ( x >='A'&& x<='Z'){
            System.out.println(1 );
        }else if( x >='a' && x<='z'){
            System.out.println( 0);
        }else{
            System.out.println(-1);
        }



    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);

        char c = s.next().charAt(0);

        Find(c);

    }
}

