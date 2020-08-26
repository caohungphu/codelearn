#https://codelearn.io/learning/python-co-ban/129149

lst = []
n = int(input())

for i in range(n):
    lst.append(int(input()))

answer = []
for i in lst:
    if i % 5 == 0:
        answer.append(i)
if len(answer) == 0:
    answer = [0]

print(answer)