package Arrays;

public class removeDuplicates {
    static int[] removeDuplicates(int[] arr, int n) {
        int i = 0;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] != arr[j])
                arr[++i] = arr[j];

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4 ,5};
        removeDuplicates(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
