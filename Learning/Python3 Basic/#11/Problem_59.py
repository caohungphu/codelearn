#https://codelearn.io/learning/python-co-ban/132246

n = int(input())

def sumOfAll(n):
    result = 0;
    for i in range(1, n + 1):
        if (n % i == 0):
            result += i
    return result

def is_abundant(n):
    if (sumOfAll(n) > 2 * n):
        return True
    return False

print(is_abundant(n))