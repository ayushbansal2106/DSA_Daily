class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num/2;
        if(num < 2 && num >0) return true;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            long square = (long) mid * mid;
            
            if(square == num) return true;
            else if(square < num) left = mid+1;
            else right = mid-1;
        }

        return false;
    }
}