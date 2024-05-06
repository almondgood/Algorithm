import sys

input = sys.stdin.readline

n, m = map(int, input().split())
num = [int(i) for i in input().split()]
num.sort()
s = []
def perm(start):
    if m == start:
        print(' '.join(map(str,s)))
        return  
    
    for i in range(n):
      if num[i] in s:
        continue
      s.append(num[i])
      perm(start + 1)
      s.pop()
        
perm(0)
