public class mergeSort {
    static void mergeArray(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        //to create the new temp array (divided array)
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
        // copying the new array to original one
        int x = low;
        for (int z = 0; z < temp.length; z++) {
            arr[x] = temp[z];
            x++;
        }

    }

    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
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
        int[] arr = { 4, 2, 8, 7, 6, 5, 1, 3,0,1,-2 };
        divideArray(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
