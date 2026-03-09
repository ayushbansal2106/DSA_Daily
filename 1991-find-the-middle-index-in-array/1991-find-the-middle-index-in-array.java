class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int p[] = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            if(i == 0){
                p[i] = nums[i];
            }else{
                p[i] = p[i-1]+nums[i];
            }
        }
        for(int i = 0; i<p.length; i++){
            if(p[i]-nums[i] == (p[p.length - 1] - p[i])){
                return i;
            }
        }
        return -1;
    }
}