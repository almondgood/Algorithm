from sys import stdin

t = int(stdin.readline())


for _ in range(t):
    commands = stdin.readline().strip()
    n = int(stdin.readline())  
    li = stdin.readline()[1:-2].split(',')
    if n == 0:
        if 'D' in commands:
            print("error")
        else:
            print([])
        continue
        
    else:
        li = list(map(int, li))
    
    
    left = 0
    right = max(0, n - 1)
    reverse = False
    result = []
    for com in commands:
        if com == 'R':
            reverse = False if reverse else True
            
        else:
            if left > right:
               result = "error"
               break 
            
            if reverse:
                right -= 1
            else:
                left += 1    
        
    if result == []:
        if reverse:
            step = -1
            left, right = right, left - 1
            
        else:
            step = 1
            right += 1
            
        for i in range(left, right, step):
            result.append(li[i])
            
    print(str(result).replace(' ', ''))