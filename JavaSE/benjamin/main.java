package benjamin;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exit = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			//lee la respuesta del usuario
			
			int seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 0:
				System.out.println("Saliste de Amazon Viewer");
				break;
			case 1:
				System.out.println("Movies");
				break;
			case 2:
				System.out.println("Series");
				break;
			case 3:
				System.out.println("Books");
				break;
			case 4:
				System.out.println("Magazines");
				break;
			default:
				System.out.println("Opción no disponible");
				break;
			}
			
		} while (exit != 0 );
		
	}

}
