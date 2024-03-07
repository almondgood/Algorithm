from sys import stdin

n = int(stdin.readline())

li = list(map(int, stdin.readline().split()))
li.insert(0,'-')
stu = int(stdin.readline())


def male(idx):
    cnt = 1
    while idx * cnt <= n:
        li[idx * cnt] = 1 if li[idx*cnt] == 0 else 0
        cnt += 1

def female(left, right):
    left -= 1
    right += 1
    if left <= 0 or right > n:
        return
    
    if li[left] == li[right]:
        li[left] = 1 if li[left] == 0 else 0
        li[right] = 1 if li[right] == 0 else 0
    
        female(left, right)


for _ in range(stu):
    gen, idx = map(int, stdin.readline().split())
    
    if gen == 1:
        male(idx)
    else : 
        li[idx] = 1 if li[idx] == 0 else 0
        female(idx, idx)

for i in range(n):
    if i % 20 == 0 and i != 0:
        print()
    print(li[i + 1], end=' ')