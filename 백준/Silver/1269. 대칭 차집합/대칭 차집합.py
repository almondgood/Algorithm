from sys import stdin
from collections import Counter

a, b = map(int, stdin.readline().split())

A = Counter(list(map(int, stdin.readline().split())))
B = Counter(list(map(int, stdin.readline().split())))

result = A + B
result = [k for k, v in result.items() if v == 1]

print(len(result))

