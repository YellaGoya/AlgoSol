def solution(absolutes, signs):
    temp = 0
    for ab, si in zip(absolutes, signs) :
        if si : temp += ab
        else : temp -= ab
    return temp