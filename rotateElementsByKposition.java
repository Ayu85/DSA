public class rotateElementsByKposition {
    static void rotate(int[] arr, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - 3] = arr[i];

        }
        int j=0;
        for(int i=d+1;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
        for(int x:arr){
            System.out.print(x+"  ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr, 3);
    }
}
