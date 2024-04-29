sum=0
n=int(input("diga su número: "))
while n<4:
    n=int(input("diga su número: "))
for x in range(4,n+1):
    sum=sum+(x**2)+(7*x)+3
print("El resultado de la sumatoria es: ",sum)
#Creado por Jaime Olarte