public class robrec {
    static int rob(int i, int[] H) {
        if (i >= H.length)
            return 0;
        return Math.max(1 + rob(i + 2, H), 1 + rob(i + 1, H));
    }

    public static void main(String[] args) {
        int[] H = { 1, 2, 3, 1 };
        System.out.println(rob(0, H));
    }
}
