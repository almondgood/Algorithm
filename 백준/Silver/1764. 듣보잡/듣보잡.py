from sys import stdin

n, m = map(int, stdin.readline().split())

dutbo = {}
dutdobodo = []
for _ in range(n):
    p = stdin.readline().strip()
    dutbo[p] = 1
    
for _ in range(m):
    p = stdin.readline().strip()
    
    if p in dutbo:
        dutdobodo.append(p)
        
print(len(dutdobodo))
dutdobodo.sort()

for p in dutdobodo:
    print(p)