import sys

input = sys.stdin.readline

n, m = map(int, input().split())
num = sorted(list(map(int ,input().split())))

s = []
def perm(start):
    if m == len(s):
        print(' '.join(map(str,s)))
        return  
    
    for i in range(start, n):
      if num[i] not in s:
        s.append(num[i])
        perm(i + 1)
        s.pop()
        
perm(0)