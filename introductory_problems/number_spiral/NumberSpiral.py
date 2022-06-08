def _get_value(row, col):
    if row == col:
        print(row * (row - 1) + 1)
    else:
        cur_max = max(row, col)
        middle = cur_max * (cur_max - 1) + 1
        if cur_max % 2 == 0:
            if col < cur_max:
                print(middle + cur_max - col)
            else:
                print(middle + row - cur_max)
        else:
            if col < cur_max:
                print(middle + col - cur_max)
            else:
                print(middle + cur_max - row)


n = int(input())
for i in range(n):
    cur_row, cur_col = [int(x) for x in input().split()]
    _get_value(cur_row, cur_col)


