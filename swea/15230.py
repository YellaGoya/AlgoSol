T = int(input())
for i in range(1,T+1):
    temp = 0
    temp2 = 0
    count = ord('a')
    inp = input()
    if inp[0] == 'a':
        for alp in inp:
            if ord(alp) == count:
                temp+=1
                count+=1
            else:
                break
                
    print('#'+str(i), temp)