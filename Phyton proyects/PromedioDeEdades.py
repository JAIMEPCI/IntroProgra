menor=0
menores=0
mayores=0
mayor=0
print("promedio de edad para menores de edad y promedio de edad para mayores de edad")
personas=int(input("cuantas personas hay en su grupo: "))
while personas<0:
    personas=int(input("cuantas personas hay en su grupo, asegurese de escribirlo bien : "))
for i in range(personas):
    edad=int(input("cuantos años tienes: "))
    if edad<18:
        menor+=1
        menores=edad+menores
    else:
        mayor+=1
        mayores=mayores+edad
if menor==0:
    print("no hay menores de edad")
else:
    print("el promedio de edad entre los menores de edad es: ",menores//menor)
if mayor==0:
    print("no hay mayores de edad")
else:
    print("el promedio de edad entre los mayores de edad es: ",mayores//mayor)
