public class numcount {
    public static void main(String[] args) {/*
                                             * int a = 876;
                                             * int count = 0;
                                             * while (a > 0) {
                                             * count++;
                                             * a = a / 10;
                                             * 
                                             * }
                                             * System.out.println(count);
                                             */
        int arr[] = { 2, 7, 11, 15 };
        int leftpointer = 0, rightpointer = arr.length - 1;
        int target = 9;
        while (leftpointer < rightpointer) {
            int sum = arr[leftpointer] + arr[rightpointer];
            if (sum == target) {
                System.out.print(leftpointer + " ," + rightpointer);
                break;
            } else if (sum > target)
                rightpointer--;
            else
                leftpointer++;
        }
    }
}
