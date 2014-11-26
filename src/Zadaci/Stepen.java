package Zadaci;

public class Stepen {
	/**
	 * 
	 * @param broj koji se stepenuje(unosi korisnik)
	 * @param broj kojim se stepenuje(takoðer unosi korisnik)
	 * @return stepenovani broj
	 */
	public static int stepen(int broj, int stepen) {
		int stepenovaniBroj = 1;
		for (int i = 1; i <= stepen; i++) {
			stepenovaniBroj = stepenovaniBroj * broj;
		}
		return stepenovaniBroj;
	}

	public static void main(String[] args) {
		System.out.println("Unesite broj koji zelite stepenovati.");
		int broj = TextIO.getlnInt();
		System.out.println("Unesite stepen.");
		int stepen = TextIO.getlnInt();
		System.out.println("Broj koji smo dobili stepenovanjem broja " + broj
				+ " brojem " + stepen + " je: " + stepen(broj, stepen));
	}
}
