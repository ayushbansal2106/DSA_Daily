class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
       int[] ans = {0, 0};
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target){
                ans[0]++;
            }else if(arr[i] > target){
                ans[1]++;
            }else{
                ans[0]++;
                ans[1]++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna