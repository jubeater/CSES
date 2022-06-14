def _get_palindrome(source : str) -> str:
    counts = [0] * 26
    cnt_odd = 0
    for cur_chr in source:
        cur_idx = ord(cur_chr) - ord('A')
        counts[cur_idx] += 1
        if counts[cur_idx] % 2 == 0:
            cnt_odd -= 1
        else:
            cnt_odd += 1
    if cnt_odd > 1:
        return "NO SOLUTION"
    else:
        odd_idx = -1
        if cnt_odd == 1:
            for i in range(26):
                if counts[i] % 2 == 1:
                    odd_idx = i
                    break
        res = ""
        for i in range(26):
            filled_chr = chr(ord('A') + i)
            cur_cnt = counts[i] // 2
            res += filled_chr * cur_cnt
        if odd_idx != -1:
            return res + chr(ord('A') + odd_idx) + res[::-1]
        else:
            return res + res[::-1]
            
        


source = input()


res = _get_palindrome(source)
print(res)