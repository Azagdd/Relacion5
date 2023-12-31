// Dado un array de tamaño (N,M) de enteros, buscar el máximo valor almacenado. 

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej6_Rel5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¿Cuantas filas quieres?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce los datos de la matriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		FuncionesMatrices.mayorvalor(matriz);
		System.out.printf("El mayor valor en la matriz seria %d", FuncionesMatrices.mayorvalor(matriz));
	}

}
