import random
mat = [[0 for rep in range(4)]for rep in range(6)]

for repf in range(6):
    for repc in range(4):
        print("Diga el valor para la posicion ",repf,"-",repc)
        mat[repf][repc] = random.randint(10,99)

for repf in range(6):
    print("-"*19)
    for repc in range(4):
        print(mat[repf][repc],"| ", end = "")
    print("")
summ=0
for repf in range(6):
    for repc in range(4):
        summ=summ+mat[repf][repc]
print("El resultado de la matriz es: ",summ)
fila=[0 for rep in range(6)]
columna=[0 for rep in range(4)]

for repf in range(6):
    sumf=0
    for repc in range(4):
        sumf=sumf+mat[repf][repc]
    fila[repf]=sumf

print("SUMA DE FILAS ","-"*100)
for rep in range(6):
    print("La suma de las filas es: ",fila[rep]," , ")

for repc in range(4):
    sumc=0
    for repf in range(6):
        sumc=sumc+mat[repf][repc]
    columna[repc]=sumc

print("")
print("SUMA DE COLUMNAS","-"*100)
for rep in range(4):
    print("La suma de las columnas es: ",columna[rep]," , ")







