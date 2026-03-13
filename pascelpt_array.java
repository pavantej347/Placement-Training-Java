public class pascelpt_array {
    public static void main(String[] args) {
        int n = 5;
        int mat[][] = new int[5][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    mat[i][j] = 1;
                else {
                    mat[i][j] = mat[i - 1][j - 1] + mat[i - 1][j];

                }
                System.out.print(mat[i][j]);

            }
            System.out.println();

        }
    }
}
