def solution(myString, pat):
    myString = myString.replace("B", "C")
    myString = myString.replace("A", "B")
    myString = myString.replace("C", "A")
    
    return 1 if pat in myString else 0