class Solution {
    public int[] twoSum(int[] height, int target) {
        int n = height.length;
        int left = 0, right = n-1;
        while(left < right){
            if(height[left] + height[right] == target){
                return new int[]{left+1, right+1};
            }else if(height[left] + height[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}