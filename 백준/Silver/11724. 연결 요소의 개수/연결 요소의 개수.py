import sys
from sys import stdin
sys.setrecursionlimit(10 ** 6)

n,m = map(int, stdin.readline().split())


dic = {}
for i in range(m):
    u,v = map(int, stdin.readline().split())
    
    if u not in dic:
        dic[u] = []
    
    if v not in dic:
        dic[v] = []
        
    dic[u].append(v)
    dic[v].append(u)
    
    
def bfs(q):
    key, values = q.pop()

    visited[key] = True

    for v in values:
        if not visited[v]:
            q.append((v, dic[v]))
            
            bfs(q)
            
visited = [False] * (n + 1)
queue = []
cnt = 0
for item in dic.items():
    queue.append(item)
    
    if not visited[item[0]]:
        bfs(queue)
    
        cnt += 1
    
for i in visited:
    if not i:
        cnt += 1
        
print(cnt - 1)