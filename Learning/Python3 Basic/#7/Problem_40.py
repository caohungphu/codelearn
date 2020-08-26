#https://codelearn.io/learning/python-co-ban/129101

lst = []
n = int(input())

for i in range(n):
    lst.append(int(input()))

answer = []
for i in lst:
    if i % 2 != 0:
        answer.append(i)

print(answer)
