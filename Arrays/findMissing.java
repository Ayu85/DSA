package Arrays;

public class findMissing {
    static int getMissing(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int x : arr)
            arrSum += x;

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        System.out.println(getMissing(arr, 5));
    }
}
