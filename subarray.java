public class subarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"  ");
                    sum+=arr[k];
                  if(sum>max)
                  max=sum;
                }

                System.out.print("s: "+sum+" - ");
            }
            System.out.println(" , ");
        }
        System.out.println(" ");
        System.out.println(max);
    }
}
