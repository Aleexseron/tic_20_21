''' Dime un numero al azar entre el 1 y 10 y lo adivino'''
def adivino():
    numero=input("Dime un numero del 1 al 10: ")
    intento=("Intentalo: ")
    while intento!= numero:
        if intento>numero:
            print "Demasiado grande"
        if intento<numero:
            print "Demasiado pequeño"
        intento=input("Intentalo de nuevo: ")
    print "Enhorabuena viajero, has acertado"


adivino()
