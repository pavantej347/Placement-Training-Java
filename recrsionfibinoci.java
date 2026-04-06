public class recrsionfibinoci {
    static int fib(int n)

    {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int a = fib(6);
        for (int i = 0; i <= a; i++) {
            System.out.println(fib(i) + " ");
        }
    }
}
