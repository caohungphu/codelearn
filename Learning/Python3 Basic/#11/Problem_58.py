#https://codelearn.io/learning/python-co-ban/132319

n = int(input())

def sumOfAll(n):
    result = 0;
    for i in range(1, n):
        if (n % i == 0):
            result += i
    return result

print(sumOfAll(n))