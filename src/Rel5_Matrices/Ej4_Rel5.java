//Dado un array de tamaño (N,M) de reales, decir si la matriz así representada es 
//triangular superior.

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej4_Rel5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige un numero para tu matriz cuadrada");
		int num = teclado.nextInt();
		
		int matriz [][] = new int [num][num];
		
		System.out.println("Introduce los datos de la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println();
		 boolean triangular=FuncionesMatrices.triangularsuperior(matriz);		
		
		if (triangular) {
			System.out.printf("Es triangular superior");
		}	else
				System.out.printf("No es triangular superior");
			
	}

}
