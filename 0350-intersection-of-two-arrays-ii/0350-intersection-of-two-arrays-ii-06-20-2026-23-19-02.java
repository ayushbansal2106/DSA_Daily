class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq1[] = new int[1001];
        int freq2[] = new int[1001];
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            freq1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++){
            freq2[nums2[i]]++;
        }
        for (int i = 0; i < 1001; i++){
            if(freq1[i] > 0 && freq2[i] > 0){
                for(int j = 0; j < Math.min(freq1[i], freq2[i]); j++){
                    list.add(i);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna