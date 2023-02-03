'''
a = int(input())                        정수형 변수 1개 입력 받는 예제
b, c = map(int, input().split())        정수형 변수 2개 입력 받는 예제 
d = float(input())                      실수형 변수 1개 입력 받는 예제
e, f, g = map(float, input().split())   실수형 변수 3개 입력 받는 예제
h = input()                             문자열 변수 1개 입력 받는 예제
'''

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    arr = [0,0,0,0,0,0,0,0]
    chk1 = 0
    for i in range(8):
        chk2 = 0
        temp = input()
        for j in range(8):
            if temp[j] == 'O':
                if arr[j] == 1 :
                    chk1 = 1
                    pass
                arr[j] = 1
                chk2 += 1
        if chk2 != 1 :
            chk1 = 1
    if chk2 == 1 and chk1 == 0 :
        print('#'+str(test_case), 'yes')
    else :
        print('#'+str(test_case), 'no')