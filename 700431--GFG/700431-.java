class Solution {
    int minDist(int arr[], int x, int y) {

        int minIndex = Integer.MAX_VALUE;
        int xIndex = -1;
        int yIndex = -1;


        for(int i=0; i<arr.length; i++){
            Boolean valChanged = false;
            if(arr[i]==x){
                xIndex = i;
                valChanged = true;
            }
            if(arr[i]==y){
                yIndex = i;
                valChanged = true;
            }

            if(valChanged && xIndex!=-1 && yIndex!=-1){
                minIndex = Math.min(Math.abs(xIndex-yIndex),minIndex);
            }

        }
        return (minIndex==Integer.MAX_VALUE) ? -1 : minIndex;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna