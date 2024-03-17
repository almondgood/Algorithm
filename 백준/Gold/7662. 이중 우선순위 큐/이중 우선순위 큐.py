from sys import stdin
import heapq
# PriorityQueue : Thread safe
# heapq : Thread Non-safe

t = int(stdin.readline())

def is_empty(dic):
    for k, v in dic.items():
        if v > 0:
            return False
    return True

for _ in range(t):
    n = int(stdin.readline())
       
    dic = {}
    max_h = []
    min_h = []  
    for _ in range(n):
        exp, op = stdin.readline().split()
        op = int(op)
        
        if exp == "I":
            if op in dic:
                dic[op] += 1
                
            else:
                dic[op] = 1
                heapq.heappush(max_h, -op)
                heapq.heappush(min_h, op)
            
        if exp == "D":
            if not is_empty(dic):
                if op == 1:
                    while -max_h[0] not in dic or dic[-max_h[0]] == 0:
                        num = -heapq.heappop(max_h)
                        if num in dic:
                            dic.pop(num)
                    dic[-max_h[0]] -= 1
                    
                elif op == -1:
                    while min_h[0] not in dic or dic[min_h[0]] == 0:
                        num = heapq.heappop(min_h)
                        if num in dic:
                            dic.pop(num)
                    dic[min_h[0]] -= 1         
                       
    if is_empty(dic):                
        print("EMPTY")
    else:
        while -max_h[0] not in dic or dic[-max_h[0]] == 0:
            num = -heapq.heappop(max_h)
        while min_h[0] not in dic or dic[min_h[0]] == 0:
            num = heapq.heappop(min_h)
        print(-heapq.heappop(max_h), heapq.heappop(min_h))