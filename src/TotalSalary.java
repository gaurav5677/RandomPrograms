import java.util.Scanner;

public class TotalSalary {
    public static double salary(int bs, char ch) {//taking the values of bs and ch form the main()
        int allow;// the allow going to be different for different salaries


        if (ch == 65) {
            allow = 1700;
        } else if (ch == 66) {
            allow = 1500;

        } else {
            allow = 1300;
        }


        double ts = ( bs + (0.2*bs )+ (0.5*bs )+allow-(0.11*bs));//used double in case of decimal
        return ts ;//if the function was in void we will simply  sout  the ts .. , but because of int we are returning the value


    }

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
            int bas = s.nextInt();
            char xh = s.next().charAt(0);
        System.out.println(   salary(bas , xh));// calling the function

    }
}

