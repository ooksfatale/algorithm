n = int(input())
lst = list(map(int,input().split()))
sum = 0
result = 0

lst.sort()

for i in lst:
    sum += i
    result +=sum

print(result)