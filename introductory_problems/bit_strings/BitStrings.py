def _get_val(k, saved_dict):
    if k in saved_dict:
        return saved_dict[k]
    else:
        half_val = _get_val(k // 2, saved_dict)
        if k % 2 == 0:
            saved_dict[k] = half_val * half_val % 1000000007
        else:
            saved_dict[k] = half_val * half_val * 2 % 1000000007
        return saved_dict[k]

n = int(input())

saved_dict = {}
saved_dict[0] = 1
saved_dict[1] = 2
res = _get_val(n, saved_dict)
print(res)