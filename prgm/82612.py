def solution(price, money, count):
    temp = (sum([price * (i+1) for i in range(count) ]) - money)
    if temp < 0 : return 0
    else : return temp