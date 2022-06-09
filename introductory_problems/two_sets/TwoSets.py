def _print_arr(arr):
    for val in arr:
        print(val, end=" ")
    print("")


n = int(input())

mod_val = n % 4
if mod_val == 1 or mod_val == 2:
    print("NO")
else:
    print("YES")
    lefts = []
    rights = []
    if mod_val == 0:
        for i in range(0, n, 4):
            lefts.append(i + 1)
            lefts.append(i + 4)
            rights.append(i + 2)
            rights.append(i + 3)
        print(n // 2)
        _print_arr(lefts)
        print(n // 2)
        _print_arr(rights)
    else:
        lefts.append(1)
        lefts.append(2)
        rights.append(3)
        for i in range(3, n, 4):
            lefts.append(i + 1)
            lefts.append(i + 4)
            rights.append(i + 2)
            rights.append(i + 3)
        print(n // 2 + 1)
        _print_arr(lefts)
        print(n // 2)
        _print_arr(rights)           