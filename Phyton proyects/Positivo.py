print("Algoritmo que imprime solo datos positivos")
n1 = [0 for a in range(20)]
p = [0 for b in range(20)]
pos = 0
for rep in range(20):
    n1[rep] = float(input("Diga el dato #" + str(rep + 1)))
    if n1[rep] > 0:
        p[pos] = n1[rep]
        pos = pos + 1
if pos > 0:
    for c in range(pos):
        print("Casilla ", c, " Número ", p[c])
else:
    print("Todos los números eran negativos")
