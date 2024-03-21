import sys

input = sys.stdin.readline

n = input()
length = len(n) - 1

ans = 0
for i in range(1, length):
    ans += 9 * (10 ** (i - 1)) * i
ans += (int(n) - (10 ** (length - 1)) + 1) * length

print(ans) 