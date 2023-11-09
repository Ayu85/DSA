package Arrays;

public class maxConsOnes {
    static int getCount(int[] arr, int n) {
        int count = 0;
        int maxCount = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count++;
            else {
                if (count > maxCount)
                    maxCount = count;

                count = 0;
            }
        }
        return maxCount > count ? maxCount : count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1,1,1, 0, 0, 1, 1, 0, 1, 1, 1 };
        System.out.println(getCount(arr, arr.length));
    }
}
