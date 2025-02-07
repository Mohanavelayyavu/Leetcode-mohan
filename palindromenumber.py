class Solution(object):
    def isPalindrome(self, x):
        n=str(x)
        r=n[::-1]
        if(x<0):
            return False
        elif(n!=r):
            return False
        else:
            return True
