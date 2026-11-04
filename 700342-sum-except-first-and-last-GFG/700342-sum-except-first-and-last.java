class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum = 0;
        if(arr.length == 1){
            return (-arr[0]);
        }
        for(int i = 1; i < arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna