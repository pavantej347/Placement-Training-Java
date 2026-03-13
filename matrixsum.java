public class matrixsum {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 7, 6 } };
        int ans = 0;
        int indx = 0;
        for (int r = 0; r < mat.length; r++) {
            int sum = 0;
            for (int c = 0; c < mat[0].length; c++) {
                sum = sum + mat[r][c];
            }
            System.out.println(sum);

        }

    }
}
