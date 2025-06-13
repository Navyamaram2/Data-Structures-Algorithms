import java.util.Arrays;

public class Bubble_sort{
    public static void main(String[] args){
        int[] arr1={8,9,5,3,4,3};
        bubblesort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

}
    