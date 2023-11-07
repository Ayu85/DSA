package Arrays;

public class leftRotateByD {
    static int[] leftRotateByD(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int j = 0;
        for (int i = d; i < n; i++) {
            arr[i] = temp[j++];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        leftRotateByD(arr, arr.length, 4);
        for (int x : arr)
            System.out.print(x + " ");
    }

}
