def solution(arr):
    temp = []
    for i in arr :
        if temp :
            if temp[-1] != i :
                temp.append(i)
        else : temp.append(i)
    return temp