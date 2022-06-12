def _get_val(k):
    res = 0
    while k >= 5:
        res += k // 5
        k = k // 5
    return res

n = int(input())


res = _get_val(n)
print(res)