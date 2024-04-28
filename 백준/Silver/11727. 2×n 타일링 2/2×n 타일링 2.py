from sys import stdin, setrecursionlimit
setrecursionlimit(10**6)

n = int(stdin.readline())

memo = [0, 1, 3]
def fibo(n):
    if len(memo) > n:
        return memo[n]
    
    memo.append(fibo(n-1) + fibo(n-2)*2)
    
    
    return memo[-1]

print(fibo(n) % 10007)