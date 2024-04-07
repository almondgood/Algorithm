import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    x1, y1, x2, y2 = map(int, input().split())

    n = int(input())
    cnt = 0    
    for _ in range(n):
        x, y, r = map(int, input().split())
        
        d1 = (x1 - x) ** 2 + (y1 - y) ** 2
        d2 = (x2 - x) ** 2 + (y2 - y) ** 2
        r = r ** 2
        
        if r > d1 and r < d2:
            cnt += 1
        elif r < d1 and r > d2:
            cnt += 1
            
    print(cnt)