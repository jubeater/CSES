def _get_val(k):
    return (k - 1) * (k + 4) * (k * k - 3 * k + 4) // 2


n = int(input())

start_res = [0, 6, 28]
for i in range(0, min(n, 3)):
    print(start_res[i])

for i in range(4, n + 1):
    print(_get_val(i))
