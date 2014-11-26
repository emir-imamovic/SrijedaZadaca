package Zadaci;

public class Simetricnost {
	/**
	 * funkcija provjerava da li je broj simetrican
	 * @param broj koji funkcija provjerava
	 * @return funkcija vraca vrijednost "true" ako je broj simetrican, u suprotnom vraca "false"
	 */
	public static boolean simetrican(int broj) {
		String obrnuto = "0";
		int normalno = broj;
		while (normalno != 0) {
			obrnuto += "" + normalno % 10;
			normalno = normalno / 10;
		}
		if (Integer.parseInt(obrnuto) == broj) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Unesite neki broj.");
		int broj = TextIO.getlnInt();
		boolean rezultat = simetrican(broj);
		if (rezultat == true) {
			System.out.println("Broj je simetrican!");
		} else {
			System.out.println("Broj nije simetrican!");
		}
	}
}
