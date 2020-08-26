#https://codelearn.io/learning/python-co-ban/132154

s = str(input())

lst = s.split()

result = []

for i in lst:
    if (len(i) > 3):
        result.append(i)

print(result)