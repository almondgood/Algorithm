import sys

input = sys.stdin.readline

n,m = map(int,input().split())

li = list(map(int,input().split()))

psum = []
psum.append(sum(li[:m]))
for i in range(n - m):
  psum.append(psum[-1] + li[i + m] - li[i])
  
print(max(psum))