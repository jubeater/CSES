def _can_pile(left: int, right: int) -> bool:
    if left > right:
        return _can_pile(right, left)
    diff = right - left
    if diff > left:
        return False
    return (left - diff) % 3 == 0
    


n = int(input())
for i in range(n):
    left, right = [int(x) for x in input().split()]
    if _can_pile(left, right):
        print("YES")
    else:
        print("NO")