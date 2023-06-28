// Dado un array de tamaño (N,M), decir si la matriz así representada es triangular 
// inferior.

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej5_Rel5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Elige un numero para tu matriz cuadrada");
		int num = teclado.nextInt();
		
		int matriz [][] = new int [num][num];
		
		System.out.println("Introduce los datos de la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println();
		FuncionesMatrices.triangularinferior(matriz);		
		
		if (FuncionesMatrices.triangularinferior(matriz)) {
			System.out.printf("Es triangular inferior");
		}	else
				System.out.printf("No es triangular inferior");
		
	}

}
