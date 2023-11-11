package Arrays;

public class twoSum {
    static int[] getIndexes(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == k)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, -1, 4, 5, 6 };
        int[] res = getIndexes(arr, arr.length, 1);
        for (int x : res)
            System.out.print(x + " ");
        // System.out.println(getIndexes(arr, arr.length, 6));
    }
}
