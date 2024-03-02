from sys import stdin

n = int(stdin.readline())

li = []
for i in range(n):
    li.append(tuple(map(int, stdin.readline().split())))
    
    
li = sorted(li, key=lambda coord : coord[1])

i = 0
for _ in range(n):
    cnt = 0
    for k in range(i, n):
        if li[i][1] != li[k][1]:
            break
        cnt += 1
    
    li[i:i + cnt] = sorted(li[i:i+cnt], key=lambda coord:coord[0])
    
    i += cnt
       
for x, y in li:
    print(x,y)