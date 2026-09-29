class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum = 0;
        
        for(int i = 0; i <= arr.length+1; i++){
            sum ^= i;
        }
        
        for(int i : arr){
            sum ^= i;
        }
        
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna