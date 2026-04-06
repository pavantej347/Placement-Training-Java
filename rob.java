import java.util.*;

public class rob {
    public static void main(String[] args) {

        int arr[] = { 2, 1, 2, 9, 1 };
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);

        }
        System.out.println(dp[dp.length - 1]);
    }

}
