import java.util.Arrays;
//This sorting is for 1 to n range and it has O(n) time complexity

class Cyclic_sort {
    public static void main(String[] args){
        int[] arr={4,5,6,7,3,1,2};//for arr in range 1 to n
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
