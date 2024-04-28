import sys

input = sys.stdin.readline

n,m = list(map(int,input().split()))
s = []
def perm(start):
    if m == len(s):
        print(' '.join(map(str,s)))
        return
    
    for i in range(start,n+1):
        if i not in s:
            s.append(i)
            perm(i+1)
            s.pop()
perm(1)