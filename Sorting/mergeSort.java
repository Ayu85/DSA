public class mergeSort {
    static void mergeArray(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int j = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[j] = arr[left];
                left++;

            } else {
                temp[j] = arr[right];
                right++;

            }
            j++;
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
        int x = low;
        for (int z = 0; z < temp.length; z++) {
            arr[x] = temp[z];
            x++;
        }

    }

    static void divideArray(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high)
            return;
        else {
            divideArray(arr, 0, mid);
            divideArray(arr, mid + 1, high);
            mergeArray(arr, low, mid, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 7, 6, 5, 1, 3 };
        divideArray(arr, 0, arr.length-1);
    }
}
