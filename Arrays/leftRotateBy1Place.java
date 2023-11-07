package Arrays;

public class leftRotateBy1Place {
    static int[] rotate(int[] arr, int n) {
        int elm = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = elm;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotate(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    
    }
}
