#https://codelearn.io/learning/python-co-ban/127226

n = int(input())

ans = 0
for i in range(1, n+1):
    ans += i / (i + 1)

print(round(ans, 2))