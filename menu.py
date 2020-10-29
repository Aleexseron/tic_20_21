Python 2.7.18 (v2.7.18:8d21aa21f2, Apr 20 2020, 13:25:05) [MSC v.1500 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> def menu():
	n_1=input("Introuzca número 1: ")
	n_2=input("Introduzca número 2: ")
	print "*******************************************"
	print "*                  MENU                   *"
	print "*******************************************"
	print "1.SUMA"
	print "2.RESTA"
	print "3.MULTIPLICACIÓN"
	print "4.DIVISIÓN"
	opcion=input("Teclee la opcion que quiera: ")
	if opcion==1:
		resultado=n_1+n_2
	if opcion==2:
		resultado=n_1-n_2
	if opcion==3:
		resultado=n_1*n_2
	if opcion==4:
		if n_2==0:
			print "Introduce un número distinto de 0"
			n_0=input("Número nuevo: ")
			resultado=n_1/n_0
		else:
			resultado=n_1/n_2
	print "El resultado es", resultado

	
>>> menu()
