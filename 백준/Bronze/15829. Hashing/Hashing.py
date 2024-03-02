from sys import stdin

l = int(stdin.readline())
s = stdin.readline().strip()

h = 0
for i in range(l):
    h += (ord(s[i]) - 96) * (31 ** i)

print(h % 1234567891)