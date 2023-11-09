package Arrays;

import java.util.ArrayList;

public class intersectionOfSorted {
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                temp.add(arr1[i]);
                i++;
                j++;
            } else
                i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 3, 4, 5,6 };
        int[] b = {  1, 2, 3, 4, 5 ,6};
        ArrayList<Integer> res = intersection(a, b, a.length, b.length);
        for (int x : res)
            System.out.print(x + " ");
    }
}
