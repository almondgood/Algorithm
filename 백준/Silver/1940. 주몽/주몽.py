import sys

input = sys.stdin.readline

n = int(input())
m = int(input())

armors = list(map(int, input().split()))
armors.sort()

start, end = 0, n - 1
ans = 0
while start < end:
  armor = armors[start] + armors[end]
  if armor > m:
    end -= 1
  elif armor < m:
    start += 1
  else:
    ans += 1
    start += 1
    end -= 1
  
print(ans)