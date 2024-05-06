import sys

input = sys.stdin.readline

n, m = map(int, input().split())

dic = {}
for _ in range(n):
  ad, pw = input().split()
  dic[ad] = pw
  
for _ in range(m):
  print(dic[input().strip()])