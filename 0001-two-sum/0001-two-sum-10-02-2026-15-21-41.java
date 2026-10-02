class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            int complement = target - current;
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }else{
                numMap.put(arr[i], i);
            }
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna