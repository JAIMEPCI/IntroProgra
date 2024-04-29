print("Vea si su numero es primo o no")
numero=int(input("diga un numero: "))
for i in range(numero+1):
    if i==0:
        cont=0
    else:
        if numero%i==0:
            cont+=1
if cont==2:
    print("tu numero es primo, mi primo")
else:
    print("tu numero no es primo, bro")