// Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej1_Rel5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce el valor donde inicializar la matriz ");
		int a = teclado.nextInt();
		
		System.out.println();
		FuncionesMatrices.inicializarenA(matriz, a);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
	}

}
