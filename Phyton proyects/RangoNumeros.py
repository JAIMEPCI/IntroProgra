valori=int(input("Diga su valor inicial: "))
valorf=int(input("Diga su valor final: "))
if valori>valorf:
    if valori%2==0:
        for rep in range(valori,valorf,-2):
            print(rep)
    else:
        for rep in range(valori-1,valorf,-2):
            print(rep)

else:
    if valori%2==0:
        for rep in range(valori,valorf,2):
            print(rep)
    else:
        for rep in range(valori+1,valorf,2):
            print(rep)