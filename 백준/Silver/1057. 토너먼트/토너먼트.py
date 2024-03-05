from sys import stdin 
from math import ceil

n, a, b = map(int, stdin.readline().split())              

r = 1
fight = False
while n > 0:
    next_a = (a + 1) // 2
    next_b = (b + 1) // 2 

    if abs(a - b) == 1 and next_a == next_b:
        fight = True
        break
        
    
    if a == n:
        a = ceil(a / 2)
        b = next_b
    elif b == n:
        a = next_a
        b = ceil(b / 2)
    else:
        a = next_a
        b = next_b
    
    n = ceil(n / 2)
    r += 1
    
    
if fight:
    print(r)
else:
    print(-1)            
      