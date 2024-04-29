print("diga su nota")
nota=int(input())
while nota<0 or nota>50:
    print("su nota esta mal escrita, repitala")
    nota=int(input())
if nota<30:
    print("sacaste una nota MALA")
else:
    if nota>40:
        print("sacaste una nota ALTA")
    else:
        print("sacaste una nota REGULAR")
