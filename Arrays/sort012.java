package Arrays;

public class sort012 {
    static void sortAll(int[] arr, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int x : arr) {
            if (x == 0)
                count0++;
            else if (x == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < count0; i++)
            arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++)
            arr[i] = 1;
        for (int i = count0 + count1; i < n; i++)
            arr[i] = 2;

    }

    static void printArr(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 0, 2, 1, 2, 0 };
        sortAll(arr, arr.length);
        printArr(arr);
}
}
