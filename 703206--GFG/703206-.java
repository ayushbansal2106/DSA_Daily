class Solution {
    public String longest(String[] arr) {
        // code here
        int index = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i].length()){
                index = i;
                max = arr[i].length();
            }
        }
        return arr[index];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna