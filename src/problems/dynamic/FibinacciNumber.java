package problems.dynamic;

public class FibinacciNumber {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        //初始化状态
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        //剪枝
        int prev = 1, curr = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            //状态转移方程
            sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
