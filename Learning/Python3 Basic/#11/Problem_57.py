#https://codelearn.io/learning/python-co-ban/132209

s = str(input())

def format(s):
    if (len(s) >= 3):
        if s[-3:] == "ing":
            s += "ly"
        else:
            s += "ing"
    return s

print(format(s))