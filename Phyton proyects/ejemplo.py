import random
print("tablas de multiplicar")
print("diga su numero")
n = int(input())
print ("la tabla de multiplicar de " , n)
bien = 0
for rep in range(11):
    print(n , " x " + str(rep + 1) + " = "+str( (rep + 1) * n))

for rep in range(5):
    mult = random.randint(1, 10)
    print("cuanto es ", n, " x ", mult)
    respuesta = int(input())
    if respuesta == n * mult:
        print("correcto! erecto")
        bien = bien + 1
    else:
        print("incorrecto! disfuncion erectil")
print("tuviste ", bien, " respuestas correctas")
