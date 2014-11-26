package Zadaci;

public class VratiCifru {
	/**
	 * 
	 * @param broj kojeg unosi korisnik
	 * @param redni broj cifre koju ce program izbacit(takoðer unosi korisnik)
	 * @return cifra pod rednim brojem
	 */
	public static int vratiCifru(int broj, int redni) {
		int cifra = 0;
		for (int i = 1; i <= redni; i++) {
			if (i == redni) {
				cifra = broj % 10;
			} else {
				broj = broj / 10;
			}
		}
		return cifra;
	}

	public static void main(String[] args) {
		System.out.println("Unesite broj");
		int broj = TextIO.getlnInt();
		System.out.println("Unesite redni broj broja kojeg zelite izbaciti.");
		int redni = TextIO.getlnInt();
		System.out.println("To je broj: " + vratiCifru(broj, redni));
	}
}
