package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int rekke : rad){
			System.out.print(rekke + " ");
		}	System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "";
		for (int[] rad : matrise) {
			for (int rekke : rad) {
				resultat += rekke + " ";
			}
			resultat += "\n";
		} 	return resultat;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] nyMatrise) {
		int[][] heltNy = new int[nyMatrise.length][nyMatrise[0].length];
		
		for (int m=0; m<nyMatrise.length; m++) {
			for (int p=0; p<nyMatrise[0].length; p++) {
				heltNy[m][p] = nyMatrise[m][p] * tall;
			}
		}
		
		
		return heltNy;
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if (mat1.length != mat2.length) {
			return false;
		}
	
		for (int i=0; i<mat1.length; i++) {
			if (mat1[i].length != mat2[i].length) {
	            return false;
	        }
	        for (int j=0; j<mat1[i].length; j++) {
	            if (mat1[i][j] != mat2[i][j]) {
	            return false; 
	     }
				
	}	
	}	return true;
	}
	
	public static int[][] speile(int [][] matrise){
		
		
		int[][] resultat = new int[matrise.length][matrise[0].length]; 
		for (int i =0; i<matrise.length; i++ ) {
			 for (int j=0; j<matrise[i].length; j++) {
				resultat[j][i] = matrise[i][j];
			 }
		 }	return resultat;
	}
	
	
	
}
	
	

	
	
	
	
	
	
	


