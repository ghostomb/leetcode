package problems;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N) {
        return fibonacci(N);
    }

    static int fibonacci(int num){
        int data=0;
        if(num==0){
            return 0;
        }else if(num==1){
            return 1;
        }else {
            data=fibonacci(num-1)+fibonacci(num-2);
        }
        return data;
    }

}
