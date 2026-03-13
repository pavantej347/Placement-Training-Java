public class add2matrix {
    public static void main(String[] args) {
        int mat1[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int mat2[][] = { { 4, 5, 6 }, { 1, 2, 3 }, { 2, 1, 4 } };
        int mat3[][] = new int[mat1.length][mat1[0].length];
        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat1[0].length; c++) {
                mat3[r][c] = mat1[r][c] + mat2[r][c];
            }
        }

        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat1[0].length; c++) {
                System.out.print(mat3[r][c] + " ");
            }
            System.out.println();

        }
    }
}
