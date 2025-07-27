def solution(price, money, count):
    total = sum(price * i for i in range(1, count + 1))
    answer = total - money

    return answer if answer > 0 else 0