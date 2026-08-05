class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while(left <= right){
            int mid = (left+right)/2;

            if(canShip(weights, days, mid)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean canShip(int[] weights, int days, int capacity){
        int dayUsed = 1;
        int currentWeight = 0;

        for(int weight : weights){
            if(currentWeight + weight <= capacity){
                currentWeight += weight;
            }else{
                dayUsed++;
                currentWeight = weight;
            }
        }
        return dayUsed <= days;
    }
}