# Creado por Jaime Olarte
import math
menu = 0
while menu != 10:
    menu = int(input("""
    1. Mostrar el valor de Pi
    2. Mostrar el valor de E
    3. Dar el valor absoluto de un número
    4. Convertir de Radianes a grados
    5. Calcular el valor del Seno, Coseno y Tangente de un ángulo solicitado en grados
    6. Calcular la Raiz cuadrada de un número
    7. Calcular el valor de una potencia
    8. Redondear un numero hacia el entero menor
    9. Calcular la Hipotenusa de un triangulo
    10. Salir
    """))
    if menu == 1:
        print("Imprime el número pi usando <math.pi>")
        print(math.pi)
    elif menu == 2:
        print("Imprime el número e usando <math.e>")
        print(math.e)
    elif menu == 3:
        n = float(input("Diga un número real para sacarle su valor absoluto usando <math.fabs()>: "))
        print(math.fabs(n))
    elif menu == 4:
        n = int(input("Diga un valor en radianes para pasarlo a grados usando <math.degrees()>: "))
        print(math.degrees(n))
    elif menu == 5:
        n = int(input("""Diga un valor en grados para sacar su seno, coseno y tangente con las funciones
                    <math.sin(math.radians(n)>
                    <math.cos(math.radians(n)>
                    <math.tan(math.radians(n)>
        :"""))
        print(math.sin(math.radians(n)))
        print(math.cos(math.radians(n)))
        print(math.tan(math.radians(n)))
    elif menu == 6:
        n = int(input("Diga un número entero para sacar su raiz cuadrada usando <math.sqrt()>: "))
        print(math.sqrt(n))
    elif menu == 7:
        print("Diga dos números, el primero la base y el segundo el exponente usando <math.pow()>: ")
        n = float(input("Diga la base: "))
        e = float(input("Diga el exponente: "))
        print(math.pow(n, e))
    elif menu == 8:
        n = float(input("Diga un número real para redondearlo usando <math.floor()> y <math.ceil()> : "))
        if (math.floor(n) + 1) > (n + 0.5):
            print(math.floor(n))
        else:
            print(math.ceil(n))
    elif menu == 9:
        print("Diga dos números, cada uno un cateto para calcular la hipotenusa usando <math.hypot()>: ")
        n = float(input("Diga el primer cateto: "))
        e = float(input("Diga el segundo cateto: "))
        print(math.hypot(n, e))
    elif menu == 10:
        print("Gracias por usar esta app :D")
    else:
        print("Parece que digitaste un número invalido! Intenta escribir uno del 1 al 10")
