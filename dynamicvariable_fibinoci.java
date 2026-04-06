import java.util.*;

public class dynamicvariable_fibinoci {
    public static int fibinoci(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return (dp[n]);
        }
        dp[n] = fibinoci(n - 1, dp) + fibinoci(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(fibinoci(n, arr));

    }

}
