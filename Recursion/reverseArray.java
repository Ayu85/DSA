public class reverseArray {
    static int[] revArray(int[] arr, int low, int high) {
        if (low >= high)
            return arr;
        else {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            revArray(arr, low + 1, high - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 5, 3, 4, 5 };
        int[] arr2={1};
        revArray(arr2, 0, arr2.length-1);
        for (int x : arr2)
            System.out.print(x + " ");
    }
}