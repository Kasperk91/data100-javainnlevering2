package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt (int[] tabell) {

		System.out.println(Arrays.toString(tabell));

	}

	// b)
	public static String tilStreng (int[] tabell_tall) {
		String resultat = "[";
		for (int i=0; i<tabell_tall.length; i++) {
			
			if (i < tabell_tall.length - 1) {
				resultat += Integer.toString(tabell_tall[i]) + ",";
			}
			else {
				resultat += Integer.toString(tabell_tall[i]);
			}
		}	return resultat + "]";
			
		
		
	}

	// c)
	public static int summer (int[] nyTabell) {
		int sum = 0;
		for (int j=0; j<nyTabell.length; j++) {
			sum += nyTabell[j];
		}	return sum;
	}	

	// d)
	public static boolean finnesTall (int[] sant_usant, int tall) {
		boolean nummer = false;
		for (int k=0; k<sant_usant.length; k++) {
			if (sant_usant[k] == tall) {
				nummer = true;
				break; }
		}	System.out.println("Tallet " + tall + " = " + nummer);
		return nummer;
	}	

	// e)
public static int posisjonTall (int[] tabell2, int tall2) {
		
		for (int f=0; f<tabell2.length; f++) {
			if (tall2 == tabell2[f]) {
			
				System.out.println("Tallet " + tall2 + " er på index " + f);
				return f;
			}		
		}
			System.out.println("-1");
			return -1;
}

	// f)
public static int[] reverser(int[] sant_usant) { // Bruker samme tabell som sant_usant
	int[] reversert = new int[sant_usant.length];
	for (int n=0; n<sant_usant.length; n++) {
	
		reversert[n] = sant_usant[sant_usant.length - n - 1];
		
		
	}	return reversert;
}

	// g)
	public static boolean erSortert (int[] tabell2) { // Bruker tabell2 om igjen her
		boolean sortert =  true;
		for (int m=0; m<tabell2.length - 1; m++) {
			if (tabell2[m] > tabell2[m+1]) {
				sortert = false;
			}	
		}	return sortert;
	}

	// h)
public static int[] settSammen(int[] nyTabell, int[] tabell2) {
	int []sammensatt = new int[nyTabell.length + tabell2.length];
	for (int g=0; g<nyTabell.length; g++) {
		sammensatt[g] = nyTabell[g];
	}
	for (int h=0; h<tabell2.length; h++) {
		sammensatt[h + nyTabell.length] = tabell2[h];
	} 	
	
		return sammensatt; 
}
}
	
