n = int(input())
nums = [int(x) for x in input().split()]


res = 0
for i in range(1 , n + 1):
    res ^= i

for num in nums:
    res ^= num

print(res)
