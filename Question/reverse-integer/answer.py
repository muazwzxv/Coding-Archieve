class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x.bit_length() >= 32:
            return 0

        reverse = []
        for i in str(abs(x)):
            reverse.append(int(i))
        
        answerStr = ""
        for i in reversed(reverse):
            answerStr = answerStr + str(i)
        
        answer = int(answerStr)
        if answer.bit_length() >= 32:
            return 0
        
        if x < 0:
            return -abs(int(answer))
        
        return int(answer)



