def solution(order):
    answer = 0
    
    for s in order:
        if 'americano' in s or 'anything' in s:
            answer += 4500
        elif 'cafelatte' in s:
            answer += 5000
    
    return answer