class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        int ans = 0;
        for(int i = 0; i < car.length; i++){
            if(date % 2 == 0){
                if(car[i] % 2 != 0){
                    ans += fine[i];
                }
            }else{
                if(car[i] %2 == 0){
                    ans += fine[i];
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna