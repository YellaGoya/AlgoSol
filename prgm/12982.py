def solution(d, budget):
    d.sort()
    count = 0
    while(d) :
        budget -= d.pop(0)
        if budget >= 0 : count += 1
        
    return count