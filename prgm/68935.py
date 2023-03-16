def solution(n):
    temp = ''
    T = 1
    while(T*3 <= n):
        T *= 3
    while(T >= 1):
        temp += str(int(n // T))
        n = n % T
        T /= 3
    
    T = 1
    ans = 0
    for i in temp :
        ans += int(i) * T
        T *= 3
        
    return ans
        
        
        