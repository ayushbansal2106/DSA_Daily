class Solution {
	void rearrange(ArrayList<Integer> arr) {
		int size = arr.size();
		ArrayList<Integer> positive = new ArrayList<>(size);
		ArrayList<Integer> negative = new ArrayList<>(size);
		
		for (int num: arr) {
			
			if (num >= 0) {
				
				positive.add(num);
			}
			
			else {
				negative.add(num);
			}
		}
		
		int p = 0; int neg = 0; int i = 0;
		
		while (p<positive.size() && neg<negative.size()) {
			
			arr.set(i++, positive.get(p++));
			arr.set(i++, negative.get(neg++));
		}
		
		while (p<positive.size()) {
			
			arr.set(i++, positive.get(p++));
		}
		
		while (neg<negative.size()) {
			
			arr.set(i++, negative.get(neg++));
		}
		
	}
	
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna