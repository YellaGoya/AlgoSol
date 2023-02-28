def solution(n):
    pos = 0
    answ = []
    while(1) :
        if n >= 10 ** pos :
            answ.append(int(n %  10 ** (pos + 1) / 10 ** pos))
            pos += 1
        else :
            return answ
        