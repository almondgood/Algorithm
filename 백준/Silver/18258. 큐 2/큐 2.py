import sys 
from collections import deque
input = sys.stdin.readline

n = int(input())

def push(n):
    queue.append(n)
    
def pop():
    if len(queue) == 0:
        return -1
    
    return queue.popleft()    

def size():
    return len(queue)

def empty():
    if size() == 0:
        return 1

    return 0
        
def front():
    if size() == 0:
        return -1
    
    return queue[0]

def back():
    if size() == 0:
        return -1
    
    return queue[-1]

queue = deque()
for _ in range(n):
    line = input().strip()
    
    if line == "pop":
        print(pop())
    elif line == "size":
        print(size())
    elif line == "empty":
        print(empty())
    elif line == "front":
        print(front())
    elif line == "back":
        print(back())
    else:
        com, num = line.split()
        num = int(num)
        push(num)
        
    