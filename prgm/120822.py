# 문자열 뒤집기
# 문제 설명
# 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
def solution(my_string):
    temp = list(my_string)
    for i in range(len(my_string)//2) :
        temp[i],temp[-i-1] = temp[-i-1],temp[i]
        
    return str(temp)