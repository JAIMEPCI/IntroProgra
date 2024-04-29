print("Algoritmo para comparar temperaturas de 2 días")
t1 = [0 for a in range(24)]
t2 = [0 for b in range(24)]
for hora1 in range(24):
    t1[hora1] = float(input("Diga la temperatura del DIA 1, en la hora " + str(hora1 + 1)))
for hora2 in range(24):
    t2[hora2] = float(input("Diga la temperatura del DIA 2, en la hora " + str(hora2 + 1)))
for com in range(24):
    if t1[com] != t2[com]:
        if t1[com] - t2[com] > 0:
            print("En la hora ", str(com + 1), " tuvo una diferencia de: ", t1[com] - t2[com])
        else:
            print("En la hora ", str(com + 1), " tuvo una diferencia de: ", t2[com] - t1[com])
    else:
        print("En la hora ", str(com + 1), " las temperaturas coincidieron")
# creado por Jaime Olarte
