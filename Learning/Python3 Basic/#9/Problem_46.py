#https://codelearn.io/learning/python-co-ban/40559

def sum_of_list(lst):
    return sum(lst)

lst = []
n = int(input())
for i in range(n):
    lst.append(int(input()))
print(sum_of_list(lst))
