from sys import stdin

n = int(stdin.readline())

def promise(depth):
    for i in range(depth):
        if lot[i] == lot[depth] or abs(i - depth) == abs(lot[i] - lot[depth]):
            return 0
        
    return 1
        
def queen(depth):
    if depth == n:
        global ans
        ans += 1
        return
    
    for i in range(n):
        lot[depth] = i
        if promise(depth):
            queen(depth + 1)
                
              
ans = 0
lot = [0] * n
queen(0)
    
print(ans)