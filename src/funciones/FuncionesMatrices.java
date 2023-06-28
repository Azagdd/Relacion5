package funciones;

import java.util.Scanner;

public class FuncionesMatrices {

	public static void pedirMatriz(int m[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.printf("Introduce el elemento (%d,%d):", fila, col);
				m[fila][col] = teclado.nextInt();
			}
		}
	}

	public static void mostrarMatriz(int m[][]) {
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.printf("%d ", m[fila][col]);
			}
			System.out.println();
		}
	}

	public static void inicializarenA(int[][] matriz, int a) {
		for (int fila = 0; fila < matriz.length; fila++) { // Bucle para fila
			for (int columna = 0; columna < matriz[0].length; columna++) { // Bucle para columna
				matriz[fila][columna] = a; // Asignar el valor de la matriz a un solo número A
			}
		}
	}

	public static boolean datosCero(int[][] matriz) {
		boolean cero = true;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[0].length; columna++) {
				if (matriz[fila][columna] != 0)
					cero = false;
			}

		}
		
		return cero;
	}

	public static int buscarycontar(int[][] matriz, int num) {
		int contarnum = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz [0].length; columna++) {
				if (matriz[fila][columna] == num)
					contarnum = contarnum+1;
			}
		}
		
		return contarnum;
		
	}

	public static boolean triangularsuperior(int[][] matriz) {
		boolean triangular = true;
		for (int fila = 1; fila < matriz.length; fila++) {
			for (int columna = 0; columna < fila; columna++) {
				if (matriz[fila][columna] != 0)
					triangular = false;
			}
	}
		
		return triangular;
				
}
	
	public static boolean triangularinferior(int[][] matriz) {
		boolean triangular = true;
		for (int fila = 0; fila < matriz.length-1; fila++) {
			for (int columna = fila+1; columna < matriz[0].length; columna++) {
				if (matriz[fila][columna] != 0)
					triangular = false;

		}
	}
		
	return triangular;
}

	public static void mayorvalor(int[][] matriz) {
			int buscarmayor = matriz[0];
			for (int fila = 0; fila < matriz.length; fila++) {
				for (int columna = 0; columna < matriz [0].length; columna++) {
					if (matriz[fila][columna] == num)
				}
			}
			
			return buscarmayor;
		
	}
}