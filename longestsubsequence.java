public class longestsubsequence {
    static int lps(int L, int R, String st) {
        if (L > R)
            return 0;
        if (L == R)
            return 1;
        if (st.charAt(L) == st.charAt(R))
            return 2 + lps(L + 1, R - 1, st);
        else {
            int left = lps(L + 1, R, st);
            int right = lps(L, R - 1, st);
            return Math.max(left, right);
        }
    }

    public static void main(String[] args) {
        String st = "abcdca";
        int n = st.length();
        int ans = lps(0, n - 1, st);
        System.out.println(ans);
    }
}
