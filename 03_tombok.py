import random
lista = []
for i in range(0, 10):
    if i % 2 == 0:
        lista[i] = 1
    else:
        lista[i] = random.randint(0,100_000)

for i in range(len(lista)):
    print(f"{i} = {lista[i]}")