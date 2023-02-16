def solution(arr, divisor):
    ans = sorted([i for i in arr if i % divisor == 0])
    if ans == [] : return [-1]
    else : return ans