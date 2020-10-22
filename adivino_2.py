''' Dime un numero al azar entre el 1 y 10 y lo adivino'''
import random

def adivino_2():
    maxn=10
    numero=random.randint(1,maxn)
    intento=("Intentalo: ")
    while intento!= numero:
        if intento>numero:
            print "Demasiado grande"
        if intento<numero:
            print "Demasiado pequeño"
        intento=input("Intentalo de nuevo: ")
    print "Enhorabuena viajero, has acertado"


adivino_2()
