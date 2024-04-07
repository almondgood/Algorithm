import sys

input = sys.stdin.readline

n = input().strip()

if '0' not in n:
    print(-1)
    
else:
    s = sum(int(i) for i in n)
    
    if s % 3 == 0:
        print(''.join(sorted(n, reverse=True)))
    
    else:
        print(-1)