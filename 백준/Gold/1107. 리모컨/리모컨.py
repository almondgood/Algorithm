from sys import stdin

n = int(stdin.readline())
m = int(stdin.readline())

broken = set(stdin.readline().split()) if m != 0 else set()

chn = 0
min_cnt = abs(100 - n)
for chn in range(1000001):
    chn_str = str(chn)
    broken_f = False
    
    for c in chn_str:
        if c in broken:
            broken_f = True
            break
    
    if not broken_f:
        cnt = len(chn_str) + abs(n - chn)
        if cnt < min_cnt:
            min_cnt = cnt
    
print(min_cnt)