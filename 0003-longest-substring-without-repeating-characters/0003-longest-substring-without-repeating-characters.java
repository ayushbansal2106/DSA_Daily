class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[256];
        int head = -1;
        int tail = 0;
        int maxSize = 0;

        while(tail < s.length()){
            while(head+1 < s.length() && freq[s.charAt(head+1)] == 0){
                head++;
                freq[s.charAt(head)]++;
            }
            maxSize = Math.max(maxSize, head-tail+1);

            if(tail <= head){
                freq[s.charAt(tail)]--;
                tail++;
            }else{
                tail++;
                head = tail - 1;
            }
        }

        return maxSize;
    }
}