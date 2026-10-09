class Solution {
    public void sortInWave(int arr[]) {
        // code here
        for(int i = 0; i < arr.length; i+=2){
            if(i+1 <= arr.length-1){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna