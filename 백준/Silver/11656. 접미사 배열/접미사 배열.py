import sys

input = sys.stdin.readline

s = input().strip()

li = []

for i in range(len(s)):
    li.append(s[i:])

li.sort()
for line in li:
    print(line)