def solution(numbers):
    temp = [i for i in range(10)]
    for i in numbers :
        temp.remove(i)
    return sum(temp)