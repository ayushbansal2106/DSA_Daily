class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if((s.charAt(left) != s.charAt(right))){
                if((isBool(s, left+1, right)) || (isBool(s, left, right-1))){
                    return true;
                }else{
                    return false;
                }
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static boolean isBool(String s, int left, int right){
        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}