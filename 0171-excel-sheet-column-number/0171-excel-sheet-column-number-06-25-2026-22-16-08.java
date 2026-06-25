class Solution {
    public int titleToNumber(String columnTitle) {
        int power = 0, ans= 0;

        for(int i = columnTitle.length() -1; i >= 0; i--){
            ans += (columnTitle.charAt(i)-'@')*Math.pow(26,power);
            power++;
        }   
        return ans;
    }
}