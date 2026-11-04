class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0) result[1]++;
            else result[0]++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna