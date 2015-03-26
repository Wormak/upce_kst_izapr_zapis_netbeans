import java.util.Scanner;

public class Faktorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("n = ");
    int n = sc.nextInt();

    double f = 1;
    for ( int i = 2; i <= n; i++ ) {
      f = f * i;
      System.out.println(i+"! = "+f);
    }

    if ( n < 0) {
      System.out.println(n+"! = ");
    } else {
      System.out.println(n+"! = "+f);
    }
  }
}
