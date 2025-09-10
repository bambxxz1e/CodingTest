def solution(num_list):
    
    even = sum(num_list[i] for i in range(1, len(num_list), 2))
    odd = sum(num_list[i] for i in range(0, len(num_list), 2))
    
    return even if even > odd else odd