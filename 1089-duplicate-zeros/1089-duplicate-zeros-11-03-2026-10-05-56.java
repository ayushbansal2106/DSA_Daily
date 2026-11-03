class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while(i < arr.length-1){
            if(arr[i] != 0){
                i++;
            }else{
                swap(i+1, arr.length-1,arr);
                arr[i+1] = 0;
                i+=2;
            }
        }
    }
    public static void swap(int i, int j, int arr[]){
        while(j>i){
            arr[j] = arr[j-1];
            j--;
        }
    }
}