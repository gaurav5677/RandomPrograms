import  java.util.Scanner;
public class SumofEvenAndOdd {
//    sample input = 1,2,3,4     output = 6 , 4
    // for taking the individual digit form the number we will use mode% and after takking the digit we will check
//    whether the digit is even or odd if it is even then we will add it in soe(Some of even) eles  in sod( sum of odd)

    public static  void SumED( int x ){
        int soe = 0, sod=0;
        while ( x >0){
            int last = x%10;
            if( last %2 == 0){
                sod +=last;
            } else {
                soe += last;
            }
            x = x /10;
        }
        System.out.println("sum of even : "+soe+ " some of odd : "+sod);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        SumED(num);
    }


}

