N, K = map(int,input().split())
arr = []
cnt = 0

for i in range(N):
    arr.append(int(input()))

arr.reverse()

for coin in arr:
    if coin <= K:
        cnt += K // coin
        K %= coin

print(cnt)