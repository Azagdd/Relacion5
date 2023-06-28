// Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero.

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej2_Rel5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		boolean cero; 
		
		System.out.println("Introduce los datos de la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println();
		cero=FuncionesMatrices.datosCero(matriz);
		
		if (cero) {
			System.out.printf("Sus elementos son cero");
		}	else
				System.out.printf("Sus elementos no son cero");
			
		
	
		
		
		
	}

}
