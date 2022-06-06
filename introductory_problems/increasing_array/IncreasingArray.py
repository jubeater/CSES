n = int(input())
nums = [int(x) for x in input().split()]

cur_max = nums[0]
res = 0
for i in range(1, n):
    if nums[i] <= cur_max:
        res += cur_max - nums[i]
    else:
        cur_max = nums[i]

print(res)