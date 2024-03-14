from sys import stdin

n, m = map(int,stdin.readline().split())
arr = list(map(int,stdin.readline().split()))

ans = 0
left = 0
right = 0
while right < n:
    part_sum = sum(arr[left:right + 1])
    
    if part_sum == m:
        ans += 1
     
    if part_sum <= m:
        right += 1
    else:
        left += 1

print(ans)