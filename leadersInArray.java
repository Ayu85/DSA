public class leadersInArray {
    static int[] leaders(int [] arr,int n){
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<n-1;i++){
            int key=arr[i];
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>key)
              { leader=false;    
                break;}
            }
            if(leader){
                temp[k]=key;
                k++;
            }
        }
        temp[k]=arr[n-1];
        return temp;
    }
    public static void main(String[] args) {
        int [] arr={10,22,12,3,0};
        int res[]=leaders(arr, arr.length);
        for(int x:res)
        System.out.print(x+" ");
    }
}
