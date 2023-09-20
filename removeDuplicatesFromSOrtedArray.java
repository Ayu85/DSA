public class removeDuplicatesFromSOrtedArray {
    // exp array [0,0,1,1,1,2,2,3,3,4]
    static int[] remove(int[] arr) {
        int ptr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                arr[i] = arr[i + 1];
                ptr = arr[i + 1];
            }
        }
        return arr;
    }

}
