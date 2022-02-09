import java.util.Scanner;

public class SimpleInterest {
    // so how we calculate simpleInterest
    // (principle * rate* time)/100;
//    so lets creat a fucntion which perform this for us
//    and now this time  in void
    public static double SimpleInterest(double p, double r, int t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter principle  , rate  and time ");
        double p = s.nextDouble();
        double r = s.nextDouble();
        int t = s.nextInt();
        System.out.println(SimpleInterest(p,r,t));





    }

}
