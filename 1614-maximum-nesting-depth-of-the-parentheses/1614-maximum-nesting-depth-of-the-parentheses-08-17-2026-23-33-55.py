class Solution:
    def maxDepth(self, s: str) -> int:
        depth = 0
        maxDepth = 0
        for i in s:
            if i=="(":
                depth += 1
            elif i==")":
                depth -= 1
            maxDepth = max(maxDepth,depth)
        return maxDepth