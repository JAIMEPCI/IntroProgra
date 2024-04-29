num=[0 for rep in range(10)]
suma=0
print("Algoritmo por encima del promedio")
for rep in range(10):
    num[rep]=int(input("Diga el dato#"+str(rep+1)))
    suma=suma+num[rep]
prom=suma/10
cant=0
for rep in range(10):
    if num[rep]>prom:
        cant=cant+1
print("Hay ",cant," datos por encima del promedio")
##Creado por Jaime Olarte