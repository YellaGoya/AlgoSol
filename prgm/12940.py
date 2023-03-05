def solution(n, m):
    mult = m * n
    while(n):
        m, n = n, m%n
    return [m, mult // m]