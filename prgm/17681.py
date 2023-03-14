def solution(n, arr1, arr2):
    map_ = [x | y for x, y in zip(arr1, arr2)]
    map_ = ['0' * (n - len(bin(line)[2:])) + bin(line)[2:] for line in map_]
    
    for i in range(n) :
        map_[i] = map_[i].replace('1', '#')
        map_[i] = map_[i].replace('0', ' ')
        
    return map_
