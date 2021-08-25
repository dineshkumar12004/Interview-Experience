def ArrayLast(num):
    # getting i/p for the Array
    Arr = []
    for i in range(N):
        Arr.append(int(input("Enter the number ")))
    
    # checking if Arr[j] last digit  is divisible by 10 
    for j in Arr:
        rem = j%10
        if(rem%10==0):
            print("YES")


N = int(input("Enter N : "))
ArrayLast(N)