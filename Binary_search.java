//searching of a element in a given array and return its index number
public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};//when array is in sorted oredr
        int target = 1;
        System.out.println(binarysearch(arr, target));
    }

    public static int binarysearch(int[] arr, int target) {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                last=mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
