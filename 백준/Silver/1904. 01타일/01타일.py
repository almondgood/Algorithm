import sys

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

n = int(input())

memo = [0, 1, 2, 3]
for i in range(3, n + 1):
  memo.append((memo[-1] + memo[-2]) % 15746)

print(memo[n])