class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq1[] = new int[1001];
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++){
            freq1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++){
            if(freq1[nums2[i]] > 0){
                list.add(nums2[i]);
                freq1[nums2[i]]--;
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