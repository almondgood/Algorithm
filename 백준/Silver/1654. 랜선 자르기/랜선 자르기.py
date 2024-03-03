from sys import stdin

n, k = map(int, stdin.readline().split())

li = []
for _ in range(n):
    li.append(int(stdin.readline()))

li.sort()

s = sum(li)

min = 0
max = s // k + 1
length = max // 2

memo = {}
while True:
    cnt = 0
    for i in li:
        cnt += i // length
        
        
    #print("cnt, length", cnt, length)
    memo[length] = cnt
    
    
    
    if cnt == k:
        if length == max or (length + 1) in memo and (memo[length] < memo[length + 1]):
            break
    
    
    if cnt >= k:
        min = length + 1
        length = (max + min) // 2
    elif cnt < k:
        max = length - 1
        length = (max + min) // 2 
        
    if max < min:
        break
        
print(length)
     