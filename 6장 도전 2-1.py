num1 = float(input("첫 번째 수 입력: "))
num2 = float(input("두 번째 수 입력: "))

operator = input("원하는 연산 기호 하나 입력: (+ - * /) ")

if operator == '+':
    print(f"{num1} + {num2} = {num1 + num2}")
elif operator == '-':
    print(f"{num1} - {num2} = {num1 - num2}")
elif operator == '*':
    print(f"{num1} * {num2} = {num1 * num2}")
elif operator == '/':
    if num2 != 0: 
        print(f"{num1} / {num2} = {num1 / num2}")
    else:
        print("0으로 나눌 수 없습니다.")
else:
    print("올바른 연산 기호를 입력하세요.")
