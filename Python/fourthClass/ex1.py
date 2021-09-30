lst = list(map(int,input()))
result1 = []
result2 = []

for i in lst:
    if i!=0 :
        result1.append(i)
    else :
        result2.append(i)

lst = result1+result2

print(lst)