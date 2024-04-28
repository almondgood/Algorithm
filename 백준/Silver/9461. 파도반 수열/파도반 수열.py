import sys

input = sys.stdin.readline

t = int(input())

memo = [0,1,1,1,2,2,3,4,5,7,9]
for i in range(11,101):
    memo.append(memo[i-3] + memo[i-2])
for _ in range(t):
  n = int(input())
  
  print(memo[n])