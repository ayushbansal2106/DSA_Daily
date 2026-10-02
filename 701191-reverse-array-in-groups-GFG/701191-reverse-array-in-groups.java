class Solution {
	public void reverseInGroups(int[] arr, int k) {
		
		for (int i = 0; i < arr.length; i += k) {
			int right = Math.min(i + k - 1, arr.length - 1);
			reverse(arr, i, right);
		}
		
	}
	public static void reverse(int arr[], int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna