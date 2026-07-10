class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq = [0]*256

        for ch in s:
            freq[ord(ch)] += 1
        
        for i in range (len(s)):
            if(freq[ord(s[i])]) == 1:
                return i
        return -1