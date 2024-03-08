from sys import stdin

n = int(stdin.readline())

stack = [0]
cnt = 0

str = []
for _ in range(n):
    inp = int(stdin.readline())
    top = stack[-1]
    if inp > cnt:
        while inp > cnt:      
            cnt += 1 
            stack.append(cnt)
            str += "+\n"
            
            
    else:
        if top < inp:
            str = "NO"
            break
            
        while top > inp:
            str += '-\n'
            stack.pop()
            top = stack[-1]
            
    str += '-\n'
    stack.pop()
    top = stack[-1]

print(''.join(str))           
