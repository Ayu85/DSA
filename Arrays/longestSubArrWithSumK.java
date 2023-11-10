package Arrays;

public class longestSubArrWithSumK {
    static int getLongest(int[] arr, int n, int m) {
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int len = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    len++;
                }
                if (sum == m && len > maxLen) {
                    maxLen = len;

                }
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int arr2[] = { -5, 8, -14, 2, 4, 12 };
        System.out.println(getLongest(arr2, arr2.length, -5));
    }
}
