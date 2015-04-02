import java.util.Scanner;
import java.util.Arrays;

public class Pole {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("n[?] : ");
    int array_length = sc.nextInt();

    int[] array = new int[array_length];
    for ( int i = 0; i < array.length; i++ ) {
      array[i] = (int)( 101 * Math.random() );
    }

    System.out.print("n[" + array.length + "] =");
    for ( int i : array ) {
      System.out.print(" " + i + ";");
    }
    System.out.println();

    Arrays.sort(array);
    System.out.print("n[" + array.length + "] =");
    for ( int i : array ) {
      System.out.print(" " + i + ";");
    }
    System.out.println();

    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for ( int i : array ) {
      if ( i > max ) {
        max = i;
      }
      if ( i < min ) {
        min = i;
      }
      sum += i;
    }

    System.out.print("Sum: " + sum + "; ");
    System.out.print("Min: " + min + "; ");
    System.out.print("Max: " + max + ";\n");
  }
}
