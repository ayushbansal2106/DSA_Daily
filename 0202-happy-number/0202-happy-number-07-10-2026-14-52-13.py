class Solution:
    def isHappy(self, n: int) -> bool:
        while n >= 10:
            total = 0
            while n > 0:
                digit = n % 10
                total += digit*digit
                n//=10
            n=total
        return n == 1 or n == 7