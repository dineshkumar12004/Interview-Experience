# swap adjacent elements in an array


#I/p: a =[1,2,3,4] 
#O/p:  a =[2,1,4,3]


def swap(num):
    i = 0
    while(i < len(num) - 1):
        temp = num[i]
        num[i] = num[i+1]
        num[i+1] = temp
        i = i + 2;
    return num
res = swap([1,2,3,4])
print(res)