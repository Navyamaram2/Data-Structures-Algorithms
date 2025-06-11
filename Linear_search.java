class Linearsearch{
    public static void main(String[] args){
        int[] arr={2,7,8,4,3};
        int target=8;
        System.out.println(linearsearch(arr,target));

    }
    public static int linearsearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }

}