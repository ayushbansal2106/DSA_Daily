class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int i = s.lastIndexOf(" ");
        int len = s.length();
        return len-i-1;
    }
}