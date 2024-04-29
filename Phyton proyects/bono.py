print('\x1b[0;39;43m' + '   ' + '\x1b[0m') #amarillo
print('\x1b[0;39;45m' + '   ' + '\x1b[0m') #morado
print('\x1b[0;39;46m' + '   ' + '\x1b[0m') #azulillo
print('\x1b[0;39;40m' + '   ' + '\x1b[0m') #negro
print('\x1b[0;39;41m' + '   ' + '\x1b[0m') #rojo
print('\x1b[0;39;42m' + '   ' + '\x1b[0m') #verde
print('\x1b[0;39;51m' + '   ' + '\x1b[0m') #gris oscuro con recuadro blanco










m = [[0 for rep in range(10)]for rep in range(10)]
for repf in range(10):
    for repc in range(10):
        if repc<=repf:
            m[repf][repc] = 1
for repf in range(10):
    print("-"*39)
    for repc in range(10):
        print(m[repf][repc],"| ", end = "")
    print("")
print("-"*39)