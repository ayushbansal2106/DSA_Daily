class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        temp = 0
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
                nums[i]*=2
                nums[i+1] = 0
                # i = i+1
        for i in range(len(nums)):
            if nums[i]!= 0:
                nums[temp],nums[i] = nums[i],nums[temp]
                temp+=1
        return nums