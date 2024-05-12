import sys
from math import gcd

input = sys.stdin.readline

n = int(input())
a = int(input())

li = []
for _ in range(n - 1):
    num = int(input())
    li.append(num - a)
    a = num

g = li[0]
for i in range(1, len(li)):
    g = gcd(g, li[i])

result = 0
for i in li:
    result += i // g - 1
print(result)