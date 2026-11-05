class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        for(int i = 0, j = arr.length-1; i < arr.length/2 && j > arr.length/2; i++, j--){
            if(arr[i]!=arr[j]) return false;
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna