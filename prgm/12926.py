def solution(s, n):
    temp = list(s)
    text = ''
    for i in temp :
        if i == ' ' : text += ' '
        elif ord(i) <= 90 : text += chr((ord(i) - 65 + n) % 26 + 65)
        else : text += chr((ord(i) - 97 + n) % 26 + 97 )
            
    return text