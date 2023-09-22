public class secondLargest_Smallest_inArray {
    static int secsmallest(int[] a,int n){
        int small = a[0];
        int ssmall = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] < small) {
                ssmall = small;
                small = a[i];
            } else if (a[i] < ssmall) {
                ssmall= a[i];
            }
        }
        return ssmall;
    }
    static int seclargest(int[] a, int n) {
        int larg = a[0];
        int sLarg = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] > larg) {
                sLarg = larg;
                larg = a[i];
            } else if (a[i] > sLarg) {
                sLarg = a[i];
            }
        }
        return sLarg;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 15, 8 };
        System.out.println("Second Largest Num : "+ seclargest(arr, 5));
        System.out.println("Second Smallest Num : "+secsmallest(arr, 5));
    }
}
