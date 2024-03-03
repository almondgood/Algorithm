from sys import stdin

mexp = stdin.readline().strip()
stack = [0]
post = ""

    
for c in mexp:
    # 알파벳
    if ord(c) in range(ord('A'), ord('Z') + 1):
        post += c
    # 후순위
    elif c in ['+', '-']:
        if stack[-1] in ['+', '-']:
            post += stack.pop()
        elif stack[-1] in ['*', '/']:
            while stack[-1] not in [0, '(']:
                post += stack.pop()
                
        stack.append(c)
    # 중순위
    elif c in ['*', '/']:
        if stack[-1] in ['*', '/']:
            post += stack.pop()
        stack.append(c)
    # 선순위
    elif c == '(':
        stack.append(c)
    elif c == ')':
        while stack[-1] != '(':
            post += stack.pop()
        stack.pop()
            
while stack[-1] != 0:
    post += stack.pop()
        
        
print(post)