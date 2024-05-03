money=int(input('투입한 돈: '))
price=int(input('물건 값: '))

change=money-price
print('change',change)

c500=change//500
change=change%500

c100=change//100

print('coin500',c500)
print('coin100',c100)
