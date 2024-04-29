nombre=["a" for rep in range(10)]
p=[0 for rep in range(10)]
c=11
i=11
m=0
r="el ganador es "
for rep in range(10):
    print("diga el nombre")
    nombre[rep]=str(input())
    while c>10 or c<0:
        print("diga las respuestas correctas")
        c=int(input())
    c=c*5
    while i+c>10 or i<0:
        print("diga las respuestas incorrectas")
        i=int(input())
    i=i*-2
    p[rep]=c+i
    if p[rep]>m:
        m=p[rep]
for rep in range(10):
    if p[rep]==m:
        r=str(r+nombre[rep])
print(r,"con una nota de ",m)
