public class longestSubarrayWithSumK{
    static int longestSub(int[] arr,int k,int n){
        int maxLength=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=0;
                int length=0;
                for(int z=i;z<=j;z++){
                    sum+=arr[z];
                    length++;
                    if(sum==k){
                        if(length>maxLength)
                        maxLength=length;
                    }
                }
            }

        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3};
        System.out.println(longestSub(arr, 2, arr.length));
    }
}