package problems.easy;

public class FibonacciNumber_509 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 1, curr = 1, sum = 2;
        for (int i = 3; i <= n ; i++) {
            sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
