import java.util.*;
public class Ejercicio4{
	public static void main(String[] args) {
		//definimos variables, tamanio del arreglo e inicializamos scannner
		Scanner scanner = new Scanner(System.in);
		int i, j;
		String edad[];
		String temp;
		edad = new String[20];
		//creamos un ciclo
		for (i = 1; i <= 20 ; i++) {
			System.out.println("Digita la edad: "+i);
			edad[i-1] = scanner.nextLine();			
		}
		for (i = 1; i <= 20 ; i++) {
			for (j = i+1; j <= 20 ;j++) {
				if (edad[i-1] == edad[j-1]) {
					temp = edad[i-1];
					edad[i-1] = edad [j-1];
					edad[j-1] = temp;
					
				}
				
			}

			
		}
		//imprimimos resultados
		System.out.println("El de menor edad es: "+edad[0]);
		System.out.println("El de mayor edad es: "+edad[19]);

	}
}
