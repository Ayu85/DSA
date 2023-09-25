public class rearrangeArrayBySign {
    static int [] arrangeAll(int[] arr,int n){
    
        int[] temp=new int[n];
        int k=0;
        int j=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[j]=arr[i];
                j=j+2;
            }
            else if(arr[i]>0){ 
                temp[k]=arr[i];
                k=k+2;
            }
         }     
         return temp;   

    }
    public static void main(String[] args) {
        int[]  arr={4,-1,3,-4,2,-1};
        int[] arr2={3,1,-2,-5,2,-4};
        int [] res=arrangeAll(arr2, arr2.length);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
