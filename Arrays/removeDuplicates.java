package Arrays;

public class removeDuplicates {
    static int[] removeDuplicates(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j])
                    arr[++i] = arr[j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3,4,4 };
        removeDuplicates(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
