from sys import stdin

n = int(stdin.readline())
li = [0] * 10001

for i in range(n):
    li[int(stdin.readline())] += 1

for i in range(10001):
    for k in range(li[i]):
        print(i)