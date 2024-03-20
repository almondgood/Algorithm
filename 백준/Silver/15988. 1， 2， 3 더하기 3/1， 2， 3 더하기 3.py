import sys
sys.setrecursionlimit(10 ** 6)

input = sys.stdin.readline

t = int(input())

memo = [0, 1, 2, 4]
for _ in range(t):
    n = int(input())
    
    if len(memo) <= n:
        for i in range(len(memo), n + 1):
            memo.append((memo[i - 3] + memo[i - 2] + memo[i - 1]) % 1000000009)
        
    print(memo[n])