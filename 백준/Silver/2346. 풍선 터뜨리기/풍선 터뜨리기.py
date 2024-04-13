import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

d = deque([i for i in range(0, n)])
coms = list(map(int, input().split()))

for i in range(0, n):
  num = d.popleft()
  print(num + 1)
  
  if i == n - 1:
    break
  
  if coms[num] > 0:
    for j in range(0, coms[num] - 1):
      d.append(d.popleft())
  else:
    for j in range(0, -coms[num]):
      d.appendleft(d.pop())