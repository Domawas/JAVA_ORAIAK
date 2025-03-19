# feladat isnmertetése
tipus = input("_i_smétléssel v. _n_élküle? (i/n)")
print("2,3,4 jegyekből a számok", end="")
if tipus == "i":
    ism = True
    print(" ismétléssel")
else:
    ism = False
    print(" ismétlés nélkül")

# feladat elkészítése:
db_ism = 0
db_ism_nlk = 0
for i in range(2,5):
    for j in range(2, 5):
        for k in range(2, 5):
            # választás kezelése:
            if ism:
                db_ism += 1
                print(f"{i}{j}{k}")
            elif i != j and i != k and j != k:
                db_ism_nlk += 1
                print(f"{i}{j}{k}")

# statisztika megjelenítése:
if ism:
    print("az esetek száma ismétléssel:", db_ism)
else:
    print("az esetek száma ismétlés nélkül:", db_ism_nlk)