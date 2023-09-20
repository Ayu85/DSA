public class removeDuplicatesFromSOrtedArray {
    // exp array [0,0,1,1,1,2,2,3,3,4]
    static int remove(int[] arr) {
        int ptr = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[ptr]){
                ptr++;
                arr[ptr]=arr[i];
            }
        } 
        return ptr+1;
    }
public static void main(String[] args) {
    int[] arr={0,0,1,1,1,2,2,3,3,4};
    System.out.println(remove(arr));

        }
}
