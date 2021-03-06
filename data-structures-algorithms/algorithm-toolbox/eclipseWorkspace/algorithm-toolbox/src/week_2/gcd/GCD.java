package week_2.gcd;

import java.util.*;

public class GCD {
  private static Scanner scanner;

  @SuppressWarnings("unused")
  private static int gcd(int a, int b) {
      int current_gcd = 1;
      for(int d = 2; d <= a && d <= b; ++d) {
        if (a % d == 0 && b % d == 0) {
          if (d > current_gcd) {
            current_gcd = d;
          }
        }
      }

      return current_gcd;
    }

  private static int gcd_fast(int a, int b) {
      
      if (b == 0) {
          return a;
      }

      else {
          return gcd_fast(b, a%b);
      }
    }

  public static void main(String args[]) {
    scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    if (a < b) {
        a = a+b;
        b = a-b;
        a = a-b;
    }
    System.out.println(gcd_fast(a, b));
  }
}
