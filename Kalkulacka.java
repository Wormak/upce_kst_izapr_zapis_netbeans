import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("x ");
      double x = (double)sc.nextInt();
      System.out.print("_ ");
      char o = sc.next().charAt(0);
      System.out.print("y ");
      double y = (double)sc.nextInt();

      System.out.println(x+" "+o+" "+y);
    }
}
