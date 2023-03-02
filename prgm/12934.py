def solution(n):
    lt = n ** (1/2)
    if lt % 1 != 0 :
        return -1
    else :
        return (lt + 1) ** 2