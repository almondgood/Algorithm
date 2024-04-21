import math
import sys

input = sys.stdin.readline

n = int(input())
ring = list(map(int, input().split()))

for i in range(1, n):
    cnt = math.gcd(ring[0], ring[i])
    print(f"{ring[0] // cnt}/{ring[i] // cnt}")