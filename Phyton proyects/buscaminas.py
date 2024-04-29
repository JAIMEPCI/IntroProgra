# CODIGO CREADO POR: JAIME OLARTE

import random
m = [[9 for rep in range(5)] for rep in range(5)]
v = [[9 for rep in range(5)] for rep in range(5)]

# cuantas minas
ons = 7
on = 0
while on < 7:

    c = random.randint(0, 4)
    f = random.randint(0, 4)
    if m[c][f] == 9:
        m[c][f] = 10
        on = on+1

# primera impresión
for repf in range(5):
    print("-" * 19)
    for repc in range(5):
        if v[repf][repc] == 9:
            print('\x1b[0;39;47m' + '   ' + '\x1b[0m', end="")
        else:

            print('\x1b[0;39;43m' + '   ' + '\x1b[0m', end="")
        print("|", end="")
    print("")

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

    # saber si hay minas
    if m[cf - 1][cc - 1] == 10:
        print("Perdiste! luser")
        sw=0
    else:
        mc=0
        if cc - 2 >= 0:
            if m[cf - 1][cc - 2] == 1 :
                mc+=1

        if cc < 5:
            if m[cf - 1][cc] == 1:
                mc+=1

        if cf < 5:
            if m[cf][cc - 1] == 1:
                mc+=1

        if cf - 2 >= 0:
            if m[cf - 2][cc - 1] == 0:
                mc+=1

        if cc - 2 >= 0 and cf - 2 >=0:
            if m[cf - 2][cc - 2] == 1 :
                mc+=1

        if cc < 5 and cf - 2 >= 0:
            if m[cf - 2][cc] == 1:
                mc+=1

        if cf < 5 and cc < 5:
            if m[cf][cc] == 1:
                mc+=1

        if cf - 2 >= 0 and cc - 2 >= 0:
            if m[cf - 2][cc - 2] == 0:
                mc+=1
        v[cf - 1][cc - 1]=mc
        m[cf - 1][cc - 1]=mc


        # imprimir
        for repf in range(5):
            print("-" * 19)
            for repc in range(5):
                print(v[repf][repc],end="")
                print("|", end="")
            print("")
        print("Vas en la jugada #",play)

        # ver si gano
        g=1
        for repf in range(5):
            for repc in range(5):
                if m[repc][repf] == 9:
                    g = 0

        if g==1:
            sw=1
            print("FELICIDADES HAZ GANADO EN ",play," INTENTOS")