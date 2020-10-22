def multiplicacion():
    acumuladora=1
    print "Introduceun numero: "
    for cont in range(1,5):
        print "NUMERO ",cont 
        numero=input()
        acumuladora=acumuladora*numero
    print "PRODUCTO= ",acumuladora
    

multiplicacion()
