from sys import stdin

t = int(stdin.readline())
    
for i in range(t):
    n = int(stdin.readline())
    
    cates = {}
    for _ in range(n):
        name, cate = stdin.readline().split()
        cate_cnt = 0
        if cate not in cates:
            cates[cate] = 0
        cates[cate] += 1
    
    cnt = 1
    for key, i in cates.items():
        cnt *= (i + 1)
    
    print(cnt - 1)