public class subarraySumEqualsK{
    static int sub(int[] nums,int n,int z){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                    sum+=nums[k];
                }
                if(sum==z)
                count++;
                System.out.print(": "+sum);
                System.out.print(" , ");
            }
            System.out.println();
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1};
       System.out.println( sub(arr, arr.length,2));
    }
}