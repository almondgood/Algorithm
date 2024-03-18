import sys

input = sys.stdin.readline

n = int(input())

dic ={}
for _ in range(n):
    title = input().strip()
    
    if title not in dic:
        dic[title] = 0
    dic[title] += 1
    

dic = sorted(dic.items(), reverse=True, key=lambda x: x[1])    


min_title = dic[0][0]
max_n = dic[0][1]

for title, cnt in dic:
    if cnt < max_n:
        break
    
    if title < min_title:
        min_title = title
    

print(min_title)