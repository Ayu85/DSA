public class mergeSort {
    static void mergeArray(int[] arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[arr.length];
        int j = 0;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[j] = arr[left];
                left++;
                j++;

            } else {
                temp[j] = arr[right];
                right++;
                j++;
            }
        }
        while (left <= mid) {
            temp[j] = arr[left];
            left++;
            j++;
        }
        while (right <= high) {
            temp[j] = arr[right];
            right++;
            j++;
        }

        for (int x : temp)
            System.out.print(x + " ");
    }

    static void divideArray(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            divideArray(arr, 0, mid);
            divideArray(arr, mid + 1, high);
            mergeArray(arr, low, high, mid);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 7, 6, 5, 1, 3 };
        divideArray(arr, 0, arr.length);
    }
}
