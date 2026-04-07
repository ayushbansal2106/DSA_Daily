class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        int[] freq = new int[256];
        for(int i = 0; i < n; i++){
            freq[s.charAt(i)]++;
            if(freq[s.charAt(i)]==2){
                return s.charAt(i);
            }
        }
        return s.charAt(0);
    }
}