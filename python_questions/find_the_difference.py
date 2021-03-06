'''Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.'''
def findTheDifference(s, t):
        s = sorted(s)
        t = sorted(t)
        
        for i in range(len(s)):
            if s[i] != t[i]:
                return t[i]
        return t[-1]