package Arrays;

public class secLargest {
    static int sLarg(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int max2 = 0;
        for (int x : arr) {
            if (x > max) {
                max2 = max;
                max = x;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 0, 8 ,-2,10};
        System.out.println(sLarg(arr, arr.length));
    }
}
