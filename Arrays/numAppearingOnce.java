package Arrays;

public class numAppearingOnce {
    static int getNum(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            int key = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == key)
                    count++;
            }
            if (count == 1)
                return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 8, 8, 9, 9, 6, 6, 2, 2, 0 };
        System.out.println(getNum(arr, arr.length));
    }
}
