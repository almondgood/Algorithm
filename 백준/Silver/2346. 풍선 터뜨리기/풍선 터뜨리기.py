import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
d = deque(enumerate(map(int, input().split())))

while d:
  i, move = d.popleft()
  print(i + 1)
  
  if move > 0:
    d.rotate(-(move - 1))
  else:
    d.rotate(-move)