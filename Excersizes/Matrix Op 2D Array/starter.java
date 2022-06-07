import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static int diagnolOp(int[][] matA, int[][] matB){
		int sumOfProd = 0;
		for(int x = 0; x < matA.length; x++){
			for(int y = 0; y < matA[0].length; y++){
				if(y == x){
					sumOfProd = sumOfProd + (matA[x][y] * matB[x][y]);
				}
			}
		}
		return sumOfProd;
	}
	public static int[][] expandMatrix(int[][] matA){
		int[][] matB = new int[matA.length * 2][matA[0].length * 2];
		int col = 0;
		int row = 0;
		for(int x = 0; x < matB.length; x++){
			for(int y = 1; y < matB[0].length; y = y + 2){
				System.out.println(y);
				System.out.println(row + " " + col);
				matB[x][y - 1] = matA[row][col];
				matB[x][y] = matA[row][col];
				col++;
			}
			col = 0;
			if(x%2 == 0){
				row++;
			}
		}
		return matB;
	}
	
	public static void main(String args[]) {
		int[][] arr = new int[2][3];
		arr[0][0] = -1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 5;
		arr[1][1] = 4;
		arr[1][2] = 6;
		
		System.out.println(arr);
		int[][] newarr = expandMatrix(arr);
		System.out.println(newarr);
	}
}
