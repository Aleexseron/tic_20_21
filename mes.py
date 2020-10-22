'''Me va a pedir el numero de un mes'''
def mes():
    abreviaMes="EneFebMarAbrMayJunJulAgoSepOctNovDicUnd"
    numeroMes=input("Intruduce mes: ")
    pos=(numeroMes-1)*3
    print abreviaMes[pos:(pos+3)]

mes()
