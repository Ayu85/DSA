package Arrays;

public class checkSorted {
    static boolean check(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,30,4,5};
        System.out.println(check(arr, arr.length));
    }
}
