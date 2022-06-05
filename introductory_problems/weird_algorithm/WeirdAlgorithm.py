a = int(input())

while a != 1:
    print(str(int(a)) + ' ', end = "")
    if a % 2 == 0:
        a /= 2
    else:
        a = a * 3 + 1

print(int(a))

