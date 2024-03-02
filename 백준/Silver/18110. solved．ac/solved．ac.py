from sys import stdin

def round(n):
    if n - int(n) >= 0.5:
        return int(n) + 1
    else:
        return int(n) 


n = int(stdin.readline())

li = []
for i in range(n):
    li.append(int(stdin.readline()))
    
li.sort()

cut = round(n * 0.15)
if n == 0:
    print(0)
else:
    print(round(sum(li[cut:n-cut]) / (n - cut * 2)))