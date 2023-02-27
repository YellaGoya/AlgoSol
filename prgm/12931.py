def solution(n):
    sum = 0
    i = 0
    while(1) :
        if n < 10 ** i : return sum
        sum += int(n/10**i) % 10
        i += 1
        