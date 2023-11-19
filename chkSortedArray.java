public class chkSortedArray {
    static boolean checkSort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,0};
        System.out.println(checkSort(arr, 5));
    }
}
