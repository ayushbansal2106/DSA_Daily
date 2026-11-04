class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) countX++;
            if (arr.get(i) == y) countY++;
        }

        return countX > countY ? x :
               countY > countX ? y :
               Math.min(x, y);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna