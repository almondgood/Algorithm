import sys

input = sys.stdin.readline

left = list(input().strip())
right = []

for _ in range(int(input())):
  com = list(input().split())
  if com[0] == 'L' and left:
    right.append(left.pop())
  elif com[0] == 'D' and right:
    left.append(right.pop())
  elif com[0] == 'B' and left:
    left.pop()
  elif com[0] == 'P':
    left.append(com[1])
    
left.extend(reversed(right))
print(''.join(left))