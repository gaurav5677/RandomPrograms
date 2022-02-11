import java.util.Scanner;

public class tempConverstion {


    //     basically we are going to convert fahrenhiet to celcius  **formula**  f=((s-32) * 5/9)
//    creating function which will covert temp
  public static double tempcon( double c ){
      double fah = ((c-32)*5/9);

      double fah1 =fah;
      return fah1;
  }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c= s.nextInt();
        System.out.println(tempcon(c));
    }


}

