class Solution {
    public int longestOnes(int[] nums, int k) {
        int head = -1, tail = 0, ans = 0, cnt0 = 0, n = nums.length;

        while(tail<n){
            while((head + 1 < n) && (cnt0 +(1 - nums[head+1]))<=k){
                head++;
                if(nums[head]==0){
                    cnt0++;
                }
            }
            ans = Math.max(ans, head-tail+1);

            if(tail <= head){
                if(nums[tail] == 0){
                    cnt0--;
                }
                tail++;
            }else if(tail>head){
                tail++;
                head = tail - 1;
            }
        }
        return ans;
    }
}