public class remDupFromSortArrNewArrUse {
    static int[] remov(int [] arr){
        int[] newarr=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
            {newarr[k]=arr[i];
            k++;
        }
            
        }
        newarr[k]=arr[arr.length-1];
        return newarr;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,3,3,3,4};
        int[] res=remov(arr);
        for(int x:res)
        System.out.print(x+" ");
    }
}
