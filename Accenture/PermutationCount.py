# permutation count of a string
def permute(string):
    if len(string) == 1:
        return 1
    else:
        return len(string) * permute(string[1:])


ans = permute('abc')
print(ans)
