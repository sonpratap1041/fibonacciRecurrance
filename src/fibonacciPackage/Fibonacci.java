package fibonacciPackage;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibonacci(input));
    }

    public int fibonacci(int k) {
        if (k == 0 || k == 1) {
            return k;
        }
        return fibonacci(k - 1) + fibonacci(k - 2);
    }


}
