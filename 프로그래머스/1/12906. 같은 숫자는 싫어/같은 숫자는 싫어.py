def solution(arr):
    answer = []
    prev = -1
    
    for i in arr:
        if prev != i:
            prev = i
            answer.append(i)
    
    return answer