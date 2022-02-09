import java.util.Scanner;

public class Averages_Marks {

    //formula for averages marks is (sum of sub)/ number of sub
//     so lets create the function which is  going to perform the operation
    public static double Average( int n , int m, int p){
        return (float)(n+m+p)/3;
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in );
        //enter the marks of 3 subjects ;

        int a = s.nextInt();
        int c = s.nextInt();
        int b = s.nextInt();

        double d= Average(a,c,b);
        System.out.println(d );



    }
}

