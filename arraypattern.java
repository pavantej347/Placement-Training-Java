import java.util.Scanner;

public class arraypattern {
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
        int ans = 0;
        int indx = 0;
        for (int r = 0; r < mat.length; r++) {
            int sum = 0;
            for (int c = 0; c < mat[0].length; c++) {
                sum += mat[r][c];

            }
            if (sum > ans)
                indx = r;
            ans = Math.max(ans, sum);

        }
        System.out.println();
    }
}