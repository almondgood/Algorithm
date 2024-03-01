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

# 최빈값    
# (num, cnt)
fir, sec = ((0, 0), (0, 0))
for num, cnt in num_cnt.items():
    if cnt > sec[1]:
        sec = (num, cnt)
    elif cnt == sec[1] and num < sec[0]:
        sec = (num, cnt)
    
    if fir[1] < sec[1]:
        fir, sec = sec, fir
    elif fir[1] == sec[1] and fir[0] > sec[0]:
        fir, sec = sec, fir

        
avg = round(sum(numbers) / n)
mid = numbers[n // 2]
mode = fir[0] if n == 1 or fir[1] != sec[1] else sec[0]
ran = numbers[-1] - numbers[0]   
        

print(avg)
print(mid)
print(mode)
print(ran)