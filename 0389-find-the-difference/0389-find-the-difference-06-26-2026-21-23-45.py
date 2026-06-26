class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        xor_result = 0
        for i in range (len(t)):
            if i < len(s):
                xor_result ^= ord(s[i])
            xor_result ^= ord(t[i])
        return chr(xor_result)