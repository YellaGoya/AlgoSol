def solution(s):
    a = 0
    b = 0
    for i in range(len(s)) :
        if s[i] == 'p' or s[i] == 'P' :
            a += 1
        if s[i] == 'y' or s[i] == 'Y' :
            b += 1
            
    if a == b : return True
    else : return False