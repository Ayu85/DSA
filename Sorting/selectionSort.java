

public class selectionSort {
    static int[] selSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 6, 8, 1 };
        selSort(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
