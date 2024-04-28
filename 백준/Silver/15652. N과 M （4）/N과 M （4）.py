import sys

input = sys.stdin.readline

n, m = map(int, input().split())
s = []
def perm(start):
    if m == len(s):
        print(' '.join(map(str,s)))
        return  
    
    for i in range(start, n+1):
        s.append(i)
        perm(i)
        s.pop()
        
perm(1)
