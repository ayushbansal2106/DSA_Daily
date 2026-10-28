class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations){
            x = (op.charAt(1) == '+')?x+1:x-1;
        }
        return x;
    }
}