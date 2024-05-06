import sys
from collections import defaultdict

input = sys.stdin.readline

n = int(input())
dic = defaultdict(int)

for _ in range(n):
  dic[int(input())] += 1
  
dic = sorted(dic.items(), key=lambda x : (-x[1], x[0]))
print(dic[0][0])