num=int(input("diga un número: "))
while num<0:
    num=int(input("diga un número, asegurese que esté bien escrito: "))
for i in range(num+1):
    if i==0:
        fact=1
    else:
        fact=fact*i
print("El resultado de ",num," factorial es: ",fact)
if num%10000==0:
    print("El número es multiplo de 10000")
else:
    print("El número NO es multiplo de 10000")

