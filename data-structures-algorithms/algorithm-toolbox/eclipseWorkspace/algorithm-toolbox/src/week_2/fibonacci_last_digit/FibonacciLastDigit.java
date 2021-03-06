package week_2.fibonacci_last_digit;

import java.util.*;

public class FibonacciLastDigit {
    private static Scanner scanner;

    private static int getFibonacciLastDigit(int n) {
        String s = "011235831459437077415617853819099875279651673033695493257291";
        return Character.getNumericValue(s.charAt(n%s.length()));
    }
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

