class Solution {
    public int minAddToMakeValid(String s) {
        int countO = 0;
        int countC = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                countO++;
            }else if(s.charAt(i) == ')' && countO == 0){
                countC++;
            }else{
                countO--;
            }
        }
        return countO+countC;
    }
}