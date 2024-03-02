from sys import stdin

n,m = map(int, stdin.readline().split())

li = [0]
dic = {}

for i in range(26):
    dic[chr(ord('A') + i)] = []


for i in range(n):
    poke = stdin.readline().strip()
    li.append(poke)
    dic[poke] = i + 1
        
for i in range(m):
    poke = stdin.readline().strip()
    
    if ord(poke[0]) < ord('A'):
        poke = int(poke)
        print(li[poke])
    else:
        print(dic[poke])
