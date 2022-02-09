import java.util.Scanner;

public class LargeofTwo {
    //let's create a function which will find largest number
    public static void  large( int x,int y){
        if(x>y){
            System.out.println(" num1 is larger"+ x);
        }else if(x==y){
            System.out.println(" both numbers are same : " + x+  ","+y);
        }else{
            System.out.println(" num2 is greater: "+ y);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int p = s.nextInt();
            int q = s.nextInt();
            large(p,q);
        }
    }
