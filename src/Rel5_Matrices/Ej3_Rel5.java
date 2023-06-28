// Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un  
// número A dado

package Rel5_Matrices;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ej3_Rel5 {

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
		
		System.out.println("Introduce el numero quieres buscar");
		int num = teclado.nextInt();
		
		FuncionesMatrices.buscarycontar(matriz, num);
		System.out.printf("Hay %d elementos iguales a %d", FuncionesMatrices.buscarycontar(matriz, num), num);
		
		
		
	}

}
