import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col");
        int rs = sc.nextInt();
        int cs = sc.nextInt();
        int[][] mat = new int[rs][cs];// declearing 2d array
        System.out.println("enter matrix");
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[r][c] = sc.nextInt();
            }
        }
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
