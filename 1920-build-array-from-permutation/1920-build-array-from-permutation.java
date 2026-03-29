class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        swapArray(nums, ans, 0);

        return ans;
    }

    public static void swapArray(int nums[], int ans[], int i){
        if(i == nums.length) return;
        ans[i]=nums[nums[i]];
        swapArray(nums, ans, i+1);
    }
}