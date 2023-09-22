public class move0End_brute_force {
    static int[] moveZeroes(int[] arr, int n) {
        int[] temp = new int[n];
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) { // all non zero inserted in new array
            if (arr[i] != 0) {
                count++;
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = count + 1; i < n; i++) {
            temp[i] = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int[] result=moveZeroes(arr, arr.length);
        for(int x:result)
        System.out.print(x+" ");
    }

}
