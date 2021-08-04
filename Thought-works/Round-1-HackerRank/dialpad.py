# Design a dial pad that enters two integers and do the permutation

"""
i/p: 23
abc def 
o/p: "AD AE Af BD BE BF CD CE CF"

"""

s = {}  # empty dictionary

s[2] = "ABC"
s[3] = "DEF"
s[4] = "GHI" 
s[5] = "JKL"
s[6] = "MNO"
s[7] = "PQRS"
s[8] = "TUV"
s[9] = "WXYZ"

num = int(input("Enter a number :"))


def permutation(num):
    res = ""
    if(num == 10):
        print("N/A")
    else:
        for i in range(len(s[int(num/10)])):
            for j in range(len(s[num%10])):
                res = res + s[int(num/10)][i] + s[int((num%10))][j] + " "
    return res

print(permutation(num))
