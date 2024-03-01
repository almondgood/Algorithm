from sys import stdin

n = int(stdin.readline())

numbers = []
num_cnt = {}
for i in range(n):
    num = int(stdin.readline())
    numbers.append(num)
    
    if num not in num_cnt:
        num_cnt[num] = 0
    num_cnt[num] += 1
        
numbers.sort()
       
max_cnt = 0 
mode = []
for num, cnt in num_cnt.items():
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