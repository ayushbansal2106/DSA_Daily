class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();

        while (left <= right){
            int mid = (left+right)/2;
            if(canSplit(nums, k, mid)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    boolean canSplit(int[] nums, int k, int limit) {
        int groups = 1;
        int currentSum = 0;
        for (int num : nums) {
            if (currentSum + num <= limit) {
                currentSum += num;
            } else {
                groups++;
                currentSum = num;
            }
        }
        return groups <= k;
    }
}