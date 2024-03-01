from sys import stdin
from collections import Counter

n = int(stdin.readline())

numbers = []
for i in range(n):
    numbers.append(int(stdin.readline()))
      
numbers.sort()

counter = Counter(numbers)
max_cnt = 0 
mode = []
for num, cnt in counter.items():
    if cnt > max_cnt:
        max_cnt = cnt
        mode = []
        mode.append(num)
        
    elif cnt == max_cnt:
        mode.append(num)
        
mode.sort()

avg = round(sum(numbers) / n)
mid = numbers[n // 2]
mode = mode[0] if len(mode) == 1 else mode[1]
ran = numbers[-1] - numbers[0]   
        

print(avg)
print(mid)
print(mode)
print(ran)