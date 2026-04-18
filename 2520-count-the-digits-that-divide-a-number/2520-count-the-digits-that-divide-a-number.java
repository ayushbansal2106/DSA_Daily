class Solution {
    public int countDigits(int num) {
        int tempNum = num;
        int count = 0;

        while(tempNum != 0){
            int lastDigit = tempNum % 10;
             if(lastDigit != 0 && num % lastDigit == 0){
                count++;
            }
            tempNum /= 10;
        }

        return count;
    }
}