import sys
import math

input = sys.stdin.readline
n = int(input())

for i in range(n):
    li = list(map(int, input().split()))
    total = 0
    for j in range(1, len(li)):
        for k in range(j + 1, len(li)):
            total += math.gcd(li[j], li[k])

    print(total)
