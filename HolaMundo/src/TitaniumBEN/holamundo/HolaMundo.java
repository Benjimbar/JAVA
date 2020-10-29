package TitaniumBEN.holamundo;
 // Upper Camel Case para el nombre de clases
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo :)");
		
	//DATOS PRIMITIVOS
		//enteros
		byte age = 22;
		short year = 2020;
		int user_id = 160057;
		long ants = 7172873981728L;
		
		//float
		float foot = 33.33F;
		double money = 16729997.97698689;
		
		//Char
		char genre = 'M';
		
		//Boolean
		boolean isVisible = true;
		
		//Variables
		
		int $variable = 2;
		
		//Constantes 
		int VALOR_MAX = 1;
		
		//Lower Camel Case se utiliza para la declaración
		// de variables y métodos 
		
		
		//Casting
		
		byte b = 6; 	//implicit
		short c = b;
		
		int i = 1;
		double d = 2.5;
		i = (int) d;
		
		int codigo = 1998;
		char codigoASCII = (char) codigo;
		System.out.println(codigoASCII);
		
		
		//Arrays
		int[] arregloInt = new int [3];
		double arregloDouble[];
		
		int [][] array2D = new int [2][3];// caben 6 datos
		int [][][] array3D = new int [3][3][2]; //cabel 18 datos
		int [][][][] array4D = new int [1][2][3][4];
		
		char [][] nam = { {}, {}  };
		
		//Finding the monkey
		
		char [] names = new char [4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		char [][][][] monkey = new char [2][3][2][2];
		monkey[1][0][0][1] = 'M';
		System.out.println(monkey [1][0][0][1]);
		
		//Operadores
		
		byte ope = 0;
		System.out.println(ope);
		++ ope;
		System.out.println(ope);
		ope ++;
		System.out.println(ope);
		ope --;
		System.out.println(ope);
		
		boolean True = ope<10;
		System.out.println(True);
		
		//Operadores relacionales
		int q = 8;
		int p = 5;
		System.out.println("q>p -->" + (q>p));
		System.out.println("q<p -->" + (q<p));
		
		
		//Operadores lógicos
		
		boolean n = false;
		boolean m = true;
		
		System.out.println("n && m -->" + (n && m));
		System.out.println("n || m -->" + (n || m));
		System.out.println("!n-->" + (!n));
		System.out.println("!m -->" + (!m));
		
		
	}

}
