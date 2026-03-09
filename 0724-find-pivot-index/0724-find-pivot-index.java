class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int p[] = new int[nums.length];
        int sum = 0;

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            p[i] = sum;
        }
        for(int i = 0; i<p.length; i++){
            if(p[i]-nums[i] == (p[p.length - 1] - p[i])){
                return i;
            }
        }
        return -1;
    }
}