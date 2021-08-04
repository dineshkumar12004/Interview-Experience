# remove letter from given string 

"""
i/p: "hello",["e","o"]
o/p: "hll"
"""

def remove(word,letters):
    b = []
    for i in word:
        if i in letters:
            continue
        b.append(i)
    return "".join(b)
res = remove("hello",["e","o"])
print(res)