import math
def kiirKonzolra(szoveg: str):
    print(szoveg, end="")

def osszead(a:int, b:int) -> int:
    return a+b

def f1_elso10SzamOsszege() -> int:
    osszeg = 0
    for i in range(11):
        osszeg += i
    return osszeg

kiirKonzolra("********************************\nelső 10 N+ szám összege:")
kiirKonzolra(str(f1_elso10SzamOsszege()) + "\n********************************")

def f2_KettoSzamOsszegeKiirva():
    a = 3
    b = 4
    kiirKonzolra(f"{a}+{b}={osszead(a,b)}\n")

def f3_HaromSzamOsszegenekGyokeKiirva():
    a = 3
    b = 4
    c = 5
    kiirKonzolra(f"{a}+{b}+{c} gyöke az ")
    c = c + osszead(a,b)
    gyok = math.sqrt(c)
    kiirKonzolra(str(round(gyok, 4)) + "\n")

def f4_NegySzamOsszegeKiirva():
    a = 3
    b = 4
    c = 7
    d = -1
    kiirKonzolra(f"{a}+{b}+{c}+({d})={osszead(osszead(a,b), osszead(c,d))}\n")


kiirKonzolra("\nnéhány szám összege, gyöke:\n")
f2_KettoSzamOsszegeKiirva()
f3_HaromSzamOsszegenekGyokeKiirva()
f4_NegySzamOsszegeKiirva()
