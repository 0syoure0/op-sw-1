clubA = {'kim', 'park', 'hwang'}
clubB = {'park', 'lee', 'choi'}

clubC = clubA.union(clubB)
print(clubC)

both_clubs = clubA.intersection(clubB)
print(both_clubs)

only_in_A = clubA.difference(clubB)
print(only_in_A)

only_in_B = clubB.difference(clubA)
print(only_in_B)

clubA.add('yang')
clubB.remove('lee')

print(clubA)
print(clubB)
