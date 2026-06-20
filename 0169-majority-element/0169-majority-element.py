class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        temp = 0
        for i in range (len(nums)):
	        if (count == 0):
		        temp = nums[i]
	        if(nums[i] == temp):
		        count += 1
	        else:
		        count -= 1
        return temp

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna