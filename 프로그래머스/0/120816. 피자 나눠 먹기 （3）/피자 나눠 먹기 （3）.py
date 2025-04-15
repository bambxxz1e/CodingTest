def solution(slice, n):
    answer = 0
    
    for i in range(1, slice * n) :
        if(i * slice >= n) :
            answer = i;
            break;
    
    return answer