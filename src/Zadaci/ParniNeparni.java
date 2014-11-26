package Zadaci;

public class ParniNeparni {
/**
 * 
 * @param broj iz kojeg uzimamo parne i neparne cifre(Unosi korisnik)
 * @param parnost/neparnost
 * @return ako je "true" program ispisuje parne cifre, ako je "false" program ispisuje neparne cifre
 */
	public static int podBroj(int broj, boolean parnost) {
		String parni = "";
		int parni1 = 0;
		String neparni = "";
		int neparni1 = 0;
		while (broj != 0) {
			if (broj % 2 == 0) {
				parni = broj % 10 + parni;
			} else {
				neparni = broj % 10 + neparni;
			}
			broj = broj / 10;
			
		}
		if (parnost == true) {
			return parni1 = Integer.parseInt(parni);
		} else {
			return neparni1 = Integer.parseInt(neparni);
		}

	}

	public static void main(String[] args) {
		System.out.println("Unesite broj.");
		int broj = TextIO.getlnInt();
		System.out.println("Parne cifre su: " + podBroj(broj, true));
		System.out.println("Neparne cifre su: " + podBroj(broj, false));
		while (broj != 0) {
			System.out.println("Unesite broj.");
			broj = TextIO.getlnInt();
			System.out.println("Parne cifre su: " + podBroj(broj, true));
			System.out.println("Neparne cifre su: " + podBroj(broj, false));

		}

	}

}
