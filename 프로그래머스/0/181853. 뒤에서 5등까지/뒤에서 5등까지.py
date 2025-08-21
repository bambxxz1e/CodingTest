def solution(num_list):
    num_list.sort()
    
    for i in range(len(num_list) - 5):
        num_list.pop()
    
    return num_list