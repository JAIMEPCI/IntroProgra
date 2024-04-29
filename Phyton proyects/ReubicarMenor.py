n = [0 for a in range(8)]
rta="Los datos organizados quedan: "
for rep in range(8):
    n[rep] = int(input("Diga el dato #" + str(rep + 1)+" :"))
for uno in range(7):
    for dos in range(uno + 1, 8):
        if n[uno] > n[dos]:
            t = n[uno]
            n[uno] = n[dos]
            n[dos] = t
for p in range(8):
    rta=rta+str(n[p])+". "
print(rta)
