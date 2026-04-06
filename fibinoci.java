public class fibinoci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1;

        for (int i = 0; i <= n; i++) {
            int ans = a + b;
            System.out.println(ans);
            a = b;
            b = ans;
        }
    }
}
