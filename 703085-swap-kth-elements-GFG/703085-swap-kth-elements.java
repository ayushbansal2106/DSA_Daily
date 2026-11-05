
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int n = arr.size();
        int temp1 = arr.get(k-1);
        int temp2 = arr.get(n-k);
        arr.remove(n-k);
        arr.remove(k-1);
        arr.add(k-1, temp2);
        arr.add(n-k, temp1);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna