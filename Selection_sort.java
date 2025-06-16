import java.util.Arrays;
//For every iterration the smallest element fix at starting and it follows O(n**2) time  complexity
class Selection_sort{
    public static void main(String[] args){
        int[] arr={9,5,6,3,4,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            swap(arr,i,minindex);
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}