def solution(n, m):
    answer = []
    
    answer.append(GCD(n, m))
    answer.append(n * m // GCD(n, m))
    
    return answer

def GCD(n, m):
    if m > n :
        n, m = m, n
    
    while m != 0:
        temp = n % m
        n = m
        m = temp
        
    return n