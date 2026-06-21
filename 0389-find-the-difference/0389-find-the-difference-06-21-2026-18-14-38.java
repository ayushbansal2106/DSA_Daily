class Solution {
    public char findTheDifference(String s, String t) {
        int xorResult = 0;
        for(int i = 0; i < t.length(); i++){
            xorResult ^= ((i < s.length()) ? s.charAt(i) : 0) ^ t.charAt(i);
        }
        return (char) xorResult;
    }
}