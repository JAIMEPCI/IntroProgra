cx=float(input("diga cuanto vale x: "))
cy=float(input("diga cuanto vale y: "))
if cx==0 or cy==0:
    if cx==0 and cy==0:
        print("estas en el centro")
    else:
        if cx==0:
            print("estas en el eje x")
        if cy==0:
            print("estas en el eje y")
else:
    if cx>0:
        if cy>0:
            print("estas en el cuadrante 1")
        else:
            print("estas en el cuadrante 4")
    else:
        if cy>0:
            print("estas en el cuadrante 2")
        else:
            print("estas en el cuadrante 3")