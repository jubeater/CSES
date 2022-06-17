def _num_to_gray(i : int) -> str:
    res_val = i ^ (i >> 1)
    return format(res_val, 'b')


n = int(input())
max = 1 << n

for i in range(max):
    print(_num_to_gray(i).zfill(n))


