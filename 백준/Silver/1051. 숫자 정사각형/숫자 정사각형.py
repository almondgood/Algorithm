import sys

input = sys.stdin.readline

n, m = map(int, input().split())

matrix = []
for _ in range(n):
    matrix.append(list(input().strip()))

def check(x, y, size):
    val = size
    for k in range(size, max_size):
        if y + k >= n or x + k >= m:
            return val

        if matrix[y][x] == matrix[y+k][x] == matrix[y][x+k] == matrix[y+k][x+k]:
            val = k

    return val
                
max_size = min(n, m)
size = 0
for i in range(n):
    for j in range(m):
        size = check(j, i, size)
        
print((size+1) * (size+1))