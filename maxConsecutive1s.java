public class maxConsecutive1s{
    static int getmax1s(int[] arr,int n){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                if(count>max)
                max=count;
            }
            else if(arr[i]!=1){
                
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,0,1,0,1,1,1,1};
        System.out.println(getmax1s(arr,arr.length));
    }
}