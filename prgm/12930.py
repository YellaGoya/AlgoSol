def solution(s):
    temp = ''
    for word in s.split(' ') :
        for i in range(len(word)) :
            if i % 2 == 0 : temp += word[i].upper()
            else : temp += word[i].lower()
        temp+=' '
    
    return temp[:-1]