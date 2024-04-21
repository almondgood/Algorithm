import sys

input = sys.stdin.readline

n = int(input())

ans = 0
for _ in range(n):
  line = input().strip()
  stack = []
  
  for c in line:
    if not stack:
      stack.append(c)
    elif stack[-1] == c:
      stack.pop()
    else:
      stack.append(c)
      
  if not stack:
    ans += 1
  
print(ans)