s = input()

if s == None or len(s) == 0:
    print(0)

cur, max_val = 1, 1
for i in range(1, len(s)):
    if s[i] == s[i - 1]:
        cur += 1
        max_val = max(cur, max_val)
    else:
        cur = 1

print(max_val)