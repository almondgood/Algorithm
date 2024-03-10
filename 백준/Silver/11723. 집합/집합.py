from sys import stdin

n = int(stdin.readline())
s = set()

for i in range(n):
    inp = stdin.readline().strip()
    
    if inp == "all":
        s = set(range(1, 21))
    elif inp == "empty":
        s = set()
    else:
        com, num = inp.split()
        num = int(num)
        
        if com == "add":
            s.add(num)
        elif com == "remove":
            if num in s:
                s.remove(num)
        elif com == "toggle":
            if num in s:
                s.remove(num)
            else:
                s.add(num)
        elif com == "check":
            print(1 if num in s else 0)