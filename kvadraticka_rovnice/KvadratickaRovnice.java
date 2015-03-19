import java.util.Scanner;

public class KvadratickaRovnice {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("a = ");
      double a = (double)sc.nextInt();
      System.out.print("b = ");
      double b = (double)sc.nextInt();
      System.out.print("c = ");
      double c = (double)sc.nextInt();

      double d = Math.pow(b, 2)-4*a*c;
      double x1 = -b + Math.sqrt(d) / 2 * a;
      double x2 = -b - Math.sqrt(d) / 2 * a;

      System.out.println("x = "+x1);
      System.out.println("x = "+x2);
    }
}
