import sys

input = sys.stdin.readline

a, b = map(int, input().split())
c, d = map(int, input().split())

def gcd(x, y):
    while x % y != 0:
        mod = x % y
        x = y
        y = mod
    
    return y

e = gcd(a*d+b*c, b*d)
print((a*d+b*c) // e, (b*d) // e)