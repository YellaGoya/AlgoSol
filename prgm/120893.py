# 대문자와 소문자
# 문제 설명
# 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
def solution(my_string):
    temp = list(my_string)
    for i in range(len(temp)):
        if temp[i].isupper() : temp[i] = temp[i].lower()
        else : temp[i] = temp[i].upper()
        
    return ''.join(temp)