def solution(arr):
    answer = []
    mini = min(arr)
    
    for i in arr:
        if i != mini:
            answer.append(i)
    
    return answer if answer != [] else [-1]