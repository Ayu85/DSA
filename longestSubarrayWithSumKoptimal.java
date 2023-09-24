public class longestSubarrayWithSumKoptimal {
    static int longestSub(int[] arr,int k,int n){
        int maxLength=0;
        for(int i=0;i<n;i++){
            int sum=0;
            int length=0;
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                length++;
                if(sum==k){
                    if(length>maxLength)
                    maxLength=length;
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(longestSub(arr, 3, arr.length));
    }
}
