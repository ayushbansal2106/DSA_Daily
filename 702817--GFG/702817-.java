class Solution {
	public void segregateElements(int[] arr) {
		int j = 0;
		int n = arr.length;
		int[] temp = new int[arr.length];
		for (int x: arr) {
			if (x >= 0) {
				temp[j++] = x;
			}
		}
		
		for (int x: arr) {
			
			if (x<0) {
				temp[j++] = x;
			}
		}
		
		for (int i = 0; i<n; i++) {
			arr[i] = temp[i];
		}
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna