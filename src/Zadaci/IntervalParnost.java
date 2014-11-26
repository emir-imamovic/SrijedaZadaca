package Zadaci;

public class IntervalParnost {
	/**
	 * funkcija daje "slucajni" broj u zadanom intervalu
	 * @param pocetak intervala(unosi korisnik)
	 * @param kraj intervala (unosi korisnik)
	 * @return rezultat je slucajni broj u zadanom intervalu
	 */
	public static int RandomInInterval(int pocetak, int kraj) {
		int broj = (int) (pocetak + Math.random() * kraj - pocetak + 1);
		return broj;
	}
/**
 * funkcija provjerava da li je broj paran ili prost
 * @param broj koji se provjerava
 * @return rezultat je "true" ako je broj paran,ili "false" ako je broj neparan
 */
	public static boolean isOdd(int broj) {
		boolean paran = false;
		if (broj % 2 == 0){
			paran = true;
		}
		return paran;
	}

	public static void main(String[] args) {
		System.out.println("Unesite pocetak intervala.");
		int pocetak = TextIO.getlnInt();
		System.out.println("Unesite kraj intervala.");
		int kraj = TextIO.getlnInt();
		for (int i = 1; i <= 5; i++) {
			int broj = RandomInInterval(pocetak, kraj);
			if (isOdd(broj) == true) {
				System.out.println("Random broj je: " + broj + " i paran je.");
			} else {
				System.out.println("Random broj je: "
						+ broj + " i neparan je.");
			}
		}
	}
}