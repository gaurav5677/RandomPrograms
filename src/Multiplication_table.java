import java.util.Scanner;

public class Multiplication_table {
    // hey so lets make a program which create multiplication of N till index 10 ,
    // make in modular formate .. for better understanding
    public static void table(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * x);


        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        table(c);

    }
}