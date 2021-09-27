# Strong or Weak String

string = "wow"
# string = "wowu" (2nd input)
if(string.isalpha()):
    s = ""
    for i in string:
        s += i
    if(s == s[::-1]):
        print("you inputted a strong string.")
    else:
        print("you inputted a weak string.")
