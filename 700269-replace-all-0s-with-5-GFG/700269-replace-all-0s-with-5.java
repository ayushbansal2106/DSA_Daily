class Solution {
    public int convertFive(int n) {
        // code here
        int num = n;
        int newnum = 0;
        while(num != 0){
            int digit = num%10;
            newnum = digit == 0?((newnum *10)+5):((newnum*10)+digit);
            num/=10;
        }
        num = newnum;
        int ans=0;
        while(num != 0){
            int digit = num%10;
            ans = (ans*10)+digit;
            num/=10;
        }
        return n==0?5:ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna