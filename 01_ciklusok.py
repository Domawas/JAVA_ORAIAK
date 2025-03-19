import random

print("az első 10 +páros szám összege: ")
osszeg = 0
db = 0
szam = 0
while db < 10:
    print(szam, end=", ")
    osszeg += szam
    szam += 2
    db += 1
print("\nösszesen: ", osszeg)

print("\n10..15 közötti számok, kivéve 13:")
n = random.randint(10,15)
while n != 13:
    print(n, end=" ")
    n = random.randint(10, 15)
print("\n")

print("egyjegyű számok: ", end="")
for i in range(10):
    print(i, end=" ")
print()

print("páratlan egyjegyű számok: ", end="")
for i in range(1, 10, 2):
    print(i, end=" ")
print()

print("\n3 - -3-ig abs értékben:")
for i in range(3, -4, -1):
    print(f"|{i:2}| = {abs(i)}")