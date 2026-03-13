// public class transpose {
//     public static void main(String[] args) {
//         int mat[][] = { { 1, 2, 3 }, { 4, 3, 2 }, { 3, 7, 6 } };
//         for (int r = 0; r < mat.length; r++) {
//             for (int c = 0; c < mat[0].length; c++) {
//                 System.out.print(mat[c][r] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
public class transpose {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int T = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = T;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}