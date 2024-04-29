ahorro=0
aumento=0
reduccion=0
menu=0
while menu!=4:
    menu=int(input("""
Bienvenido al menu, seleccione una opción:
1. Incrementar el ahorro (se acepta desde 100 pesos)
2. Reducir el ahorro (máximo la mitad de lo ahorrado)
3. Consultar el ahorro
4. Terminar el programa
Su opción: """))
    if menu==1:
        aumento=int(input("Diga en cuanto quiere incrementar el ahorro: "))
        while aumento<100:
            aumento=int(input("Diga en cuanto quiere incrementar el ahorro, recuerde tiene queser mayor a 100: "))
        ahorro=ahorro+aumento
    elif menu==2:
        if ahorro==0:
            print("Sus ahorros son de 0 no puede quitarse nada -.-")
        else:
            reduccion=int(input("Diga en cuando quiere reducir el ahorro: "))
            while reduccion>=(ahorro/2) or reduccion<0:
                reduccion=int(input("Diga en cuando quiere reducir el ahorro, recuerde que solo puede reducir máximo la mitad de lo ahorrado: "))
            ahorro=ahorro-reduccion
    elif menu==3:
        print("Sus ahorros son de: ",ahorro)
    else:
        print("Gracias por utilizar esta app")