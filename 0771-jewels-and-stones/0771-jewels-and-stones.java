class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int i = 0;
        int count = 0;

        while(i < n){
            int j = 0;
            while(j < m){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
                System.out.println(jewels.charAt(i) + " " + stones.charAt(j));
                j++;
            }
            i++;
        }
        return count;
    }
}