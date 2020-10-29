Python 2.7.18 (v2.7.18:8d21aa21f2, Apr 20 2020, 13:25:05) [MSC v.1500 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> def numeromes():
	numero=input("Inserte el número de mes, del 1 al 12: ")
	print "El mes", numero, "es: "
	if numero==1:
		print "Enero"
	else:
		if numero==2:
			print "Febrero"
		else:
			if numero==3:
				print "Marzo"
			else:
				if numero==4:
					print "Abril"
				else:
					if numero==5:
						print "Mayo"
					else:
						if numero==6:
							print "Junio"
						else:
							if numero==7:
								print "Julio"
							else:
								if numero==8:
									print "Agosto"
								else:
									if numero==9:
										print "Septiembre"
									else:
										if numero==10:
											print "Octubre"
										else:
											if numero==11:
												print "Noviembre"
											else:
												if numero==12:
													print "Diciembre"
												else:
													print "Inserte un número válido"

													
>>> numeromes()
