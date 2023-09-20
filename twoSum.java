public class twoSum {
    static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        throw new IllegalArgumentException("invalid arguments");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4 };
        int[] res = twosum(arr, 6);
        for (int x : res)
            System.out.print(x + " ");
    }
}