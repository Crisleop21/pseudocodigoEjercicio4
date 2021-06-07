Algoritmo pseudocodigoEjercicio4
	Definir alta,baja Como Real
	Dimension edad[20]
	
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Escribir "Digita la edad: ",i
		Leer edad[i]
	FinPara
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Para j<-i+1 Hasta 20 Con Paso 1 Hacer
			Si	edad(i)>edad(j) Entonces
				temp<-edad(i)
				edad(i)<-edad(j)
				edad(j)<-temp
			FinSi
		FinPara
	FinPara
	Escribir "El de menor edad es: ",edad(1)
	Escribir "El de mayor edad es: ",edad(20)
FinAlgoritmo
