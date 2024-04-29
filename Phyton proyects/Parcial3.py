#Creado por Jaime Olarte
l=["a" for rep in range(10)]
t=[-1 for rep in range(10)]
lc="a"
d=0
k=-1
e=0
for rep in range(10):
    print("Diga el nombre del destino #",(rep+1))
    l[rep]=str(input())
    while t[rep]<0:
        print("Diga la tarifa por kilo de este lugar")
        t[rep]=int(input())
for rep in range(5):
    print("Diga a que lugar mandará el pack")
    lc=str(input())
    while k<0:
        print("Diga cuantos kilos pesa el pack")
        k=int(input())
    for rep in range(10):
        if lc==l[rep]:
            if k>=10:
                e=t[rep]*10
                d=d+e
            else:
                e=t[rep]*k
                d=d+e
    k=-1
    print("El envio de su paquete vale ",e,"$")
print("El dinero facturado hoy es de ",d,"$")