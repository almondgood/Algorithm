import sys

input = sys.stdin.readline
n, m = map(int, input().split())

li = [1]
for i in range(1, n + 1):
  li.append(li[-1] * i)

print(li[n] // (li[m] * li[n-m]))