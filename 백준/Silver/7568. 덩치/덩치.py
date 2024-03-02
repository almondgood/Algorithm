from sys import stdin

n = int(stdin.readline())

coords = []
for i in range(n):
    coords.append(tuple(map(int, stdin.readline().split())))
    
for x1, y1 in coords:
    cnt = 1
    for x2, y2 in coords:
    
        if x1 < x2 and y1 < y2:
            cnt += 1
    
    print(cnt, end=' ')