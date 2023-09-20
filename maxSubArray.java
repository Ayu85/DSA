public class maxSubArray{

    static int maxarr(int [] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum>max)
                        max=sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("max subarray sum: "+maxarr(arr));
    }

}