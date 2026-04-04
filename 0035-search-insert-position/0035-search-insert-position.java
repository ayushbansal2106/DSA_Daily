class Solution {
    public int searchInsert(int[] nums, int target) {
        int tail = 0;
        int head = nums.length - 1;
        int mid = 0;

        while(tail<=head){
            mid = tail +( head - tail)/2;
            if(nums[mid]<target){
                tail = mid + 1;
            }
            else if(nums[mid]>target){
                head = mid - 1;
            }
            else{
                return mid;
            }
        }
    return (target>nums[mid])?mid+1:mid;
    }
}