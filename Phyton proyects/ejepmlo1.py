print("diga su edad")
edad=int(input())
while edad <=0 or edad>120:
    print("repita su edad, la dijo mal")
    edad=int(input())
if edad >= 18:
    print("ya no es bebe, es mayor de edad")
else:
    print("ute es uno bebe, es menor de edad")
    for i in range(edad):
        print("FELIZ CUMMM #",i+1)
#hecho por Jaime PCI