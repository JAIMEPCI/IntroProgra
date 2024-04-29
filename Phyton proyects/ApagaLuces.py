# CODIGO CREADO POR: JAIME OLARTE

import random

m = [[0 for rep in range(5)] for rep in range(5)]

# cuantos prendidos
ons = int(input("Diga cuantos cuadros estaran prendidos: "))
on = 0
while on < ons:
    on = on + 1
    c = random.randint(0, 4)
    f = random.randint(0, 4)
    if m[c][f] == 0:
        m[c][f] = 1
    else:
        on = on - 1

# primera impresión
for repf in range(5):
    print("-" * 19)
    for repc in range(5):
        if m[repf][repc] == 0:
            print('\x1b[0;39;47m' + '   ' + '\x1b[0m', end="")
        else:
            print('\x1b[0;39;43m' + '   ' + '\x1b[0m', end="")
        print("|", end="")
    print("")
print("Tienes un",(ons/25)*100,"% de luces prendidas")

sw = 1
play=0
while sw == 1:

    # pedir coordenadas
    cc = 10
    while cc <= 0 or cc >= 6:
        cc = int(input("Seleccione la columna, (valores de 1 a 5): "))

    cf = 10
    while cf <= 0 or cf >= 6:
        cf = int(input("Seleccione la fila, (valores de 1 a 5): "))

    play=play+1

    # cambiar on y off
    ons=ons+1
    if m[cf - 1][cc - 1] == 0:
        m[cf - 1][cc - 1] = 1
    else:
        m[cf - 1][cc - 1] = 0

    if cc - 2 >= 0:
        ons=ons+1
        if m[cf - 1][cc - 2] == 0:
            m[cf - 1][cc - 2] = 1
        else:
            m[cf - 1][cc - 2] = 0

    if cc < 5:
        ons=ons+1
        if m[cf - 1][cc] == 0:
            m[cf - 1][cc] = 1
        else:
            m[cf - 1][cc] = 0

    if cf < 5:
        ons=ons+1
        if m[cf][cc - 1] == 0:
            m[cf][cc - 1] = 1
        else:
            m[cf][cc - 1] = 0

    if cf - 2 >= 0:
        ons=ons+1
        if m[cf - 2][cc - 1] == 0:
            m[cf - 2][cc - 1] = 1
        else:
            m[cf - 2][cc - 1] = 0

    # imprimir
    for repf in range(5):
        print("-" * 19)
        for repc in range(5):
            if m[repf][repc] == 0:
                print('\x1b[0;39;47m' + '   ' + '\x1b[0m', end="")
            else:
                print('\x1b[0;39;43m' + '   ' + '\x1b[0m', end="")
            print("|", end="")
        print("")
    print("Vas en la jugada #",play)
    print("Tienes un",int((ons/25)*100),"% de luces prendidas")

    # ver si gano
    sw = 0
    for repf in range(5):
        for repc in range(5):
            if m[repc][repf] == 1:
                sw = 1
print("FELICIDADES HAZ GANADO EN ",play," INTENTOS")