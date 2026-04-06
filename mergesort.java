import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        int[] ar1 = { 1, 3, 5 };
        int[] ar2 = { 2, 4, 6, 7, 8 };
        int n1 = ar1.length;
        int n2 = ar2.length;
        int ans[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (ar1[i] < ar2[j]) {
                ans[k] = ar1[i];
                i++;
            } else {
                ans[k] = ar2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ans[k] = ar1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = ar2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
