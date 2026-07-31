class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while ((i >= 0) || (j >= 0) || (carry > 0)){
            int digitA = (i < 0) ? 0 : a.charAt(i) - '0';
            int digitB = (j < 0) ? 0 : b.charAt(j) - '0';
            int total = digitA + digitB + carry;
            carry = total / 2;
            int bit = total % 2;
            i--;
            j--;
            ans.insert(0, bit);
        }
        return ans.toString();
    }
}