from sys import stdin

n, k = map(int, stdin.readline().split())

li = []
for _ in range(n):
    li.append(int(stdin.readline()))

li.sort()

min = 0
max = (sum(li) // k) + 1
length = max // 2

while True:
    cnt = sum(i // length for i in li)
    
    if cnt >= k: 
        min = length + 1
    elif cnt < k: 
        max = length - 1
        
    length = (max + min) // 2
    
    if max < min:
        print(length)
        break