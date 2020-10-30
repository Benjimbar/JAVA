package benjamin;

import java.util.Date;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
		
		
		
	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			
			
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el número de la opción deseada presionando el número del índice");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//lee la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int seleccion = Integer.valueOf(sc.nextInt());
			
			switch (seleccion) {
			case 0:
				System.out.println("Saliste de Amazon Viewer");
				break;
			case 1:
				showMovies();
				//System.out.println("Movies");
				break;
			case 2:
				showSeries();
				System.out.println("Series");
				break;
			case 3:
				showBooks();
				System.out.println("Books");
				break;
			case 4:
				showMagazines();
				System.out.println("Magazines");
				break;
			case 5:
				makeReport();
				System.out.println("Magazines");
				break;
			case 6:
				makeReport(new Date());
				System.out.println("Magazines");
				break;
			default:
				System.out.println();
				System.out.println("¡¡Opción incorrecta!!");
				System.out.println();
				break;
			}
			
		} while (exit != 0 );
	}
	
	public static void showMovies() {
		int exit =1;
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
		}while (exit != 0);
		
	}
    public static void showSeries() {
		int exit =1;
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
		}while (exit != 0);
		
	}
    public static void showChapters() {
		int exit =1;
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
		}while (exit != 0);
		
	}
    public static void showMagazines() {
		int exit =1;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while (exit != 0);
		
	}
    public static void showBooks() {
		int exit =1;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		}while (exit != 0);
		
	}
	
    public static void makeReport() {
    	
    }

    public static void makeReport(Date date) {
    	
    }
}
