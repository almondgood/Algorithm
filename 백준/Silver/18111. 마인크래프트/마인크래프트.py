from sys import stdin
from collections import Counter

n,m,b = map(int, stdin.readline().split())

land = []
for _ in range(n):
    land += list(map(int, stdin.readline().split()))
    
land_c = Counter(land)

max_time = 2 * 256 * 500 * 500
max_height = 0

for i in range(257):
    t = 0
    usable_b = b
    
    for lh, c in land_c.items():
        if lh > i:
            t += 2 * (lh - i) * c
            usable_b += (lh - i) * c
        else:
            t += (i - lh) * c
            usable_b -= (i - lh) * c
        
    if usable_b >= 0:
        if t <= max_time:
            max_time = t
            if i > max_height:
                max_height = i

print(max_time, max_height)