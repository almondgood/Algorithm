import sys

input = sys.stdin.readline

n, m = map(int, input().split())

li = [False for _ in range(n + 1)]
cnt = 0

for i in range(2, n+1):
  if not li[i]:
    for j in range(i, n+1, i):
      if not li[j]:
        li[j] = True
        cnt += 1
        if cnt == m:
          print(j)
          exit()