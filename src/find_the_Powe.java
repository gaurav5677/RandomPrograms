import java.util.Scanner;
public class find_the_Powe {
//    Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

    public static  int power ( int x , int n ) {// here x and n are completelly differernt  they are power.x and power.n
        int ans = 1;
        while(n >0){
            ans = ans *x;
            n--;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// here x and n are main.x and  main.c
        int x = s.nextInt();
        int c = s.nextInt();
        System.out.println(power(x,c));//call the function with the values which will be given by user
    }

}
