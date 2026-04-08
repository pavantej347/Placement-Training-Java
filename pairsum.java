public class pairsum {
    static boolean pair_sum(int arr[], int val) {
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // sum = arr[i] + arr[j];
        // if (sum == val)
        // return true;
        // }
        // }
        // return false;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] == val)
                return true;
            else if (arr[l] + arr[r] > val)
                r--;
            else
                l++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 8, 10 };
        int val = 10;
        System.out.println(pair_sum(arr, val));
    }
}
