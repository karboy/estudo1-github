package aplicacao;

import java.util.Scanner;

public class _99Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int M = ler.nextInt();
		int N = ler.nextInt();
		
		int[][] matrz = new int[M][N];
		
		for (int i = 0; i < matrz.length; i++) {
			for (int j = 0; j < matrz[i].length; j++) {
				matrz[i][j] = ler.nextInt();
			}
		}
		
		int X = ler.nextInt();
		
		for (int i = 0; i < matrz.length; i++) {
			for (int j = 0; j < matrz[i].length; j++) {
				if (matrz[i][j] == X) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0 ){
						System.out.println("Left: " + matrz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrz[i-1][j]);
					}
					if (j < matrz[i].length-1) {
						System.out.println("Right: " + matrz[i][j+1]);
					}
					if (i < matrz.length-1) {
						System.out.println("Down: " + matrz[i+1][j]);
					}
				}
			}
		}
		
		ler.close();
	}

}
