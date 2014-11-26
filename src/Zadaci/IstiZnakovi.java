package Zadaci;

public class IstiZnakovi {
	/**
	 * funkcija provjerava da li u unesenoj rijeci ima jednakih znakova
	 * @param rijec koju korisnik unosi
	 * @return "true" ako ima jednakih znakova u unesenoj rijeci,u suprotnom funkcija vraca "false"
	 */
	public static boolean string(String rijec) {
		for (int i = 0; i < rijec.length(); i++) {
			String pomocna = "" + rijec.charAt(i);
			String rijec2 = rijec.replace(pomocna, "");
			if (rijec2.length() + 2 <= rijec.length()) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println("Upisite rijec.");
		String rijec = TextIO.getlnString();
		boolean rezultat = string(rijec);
		if (rezultat == true) {
			System.out.println("Neki karakteri se ponavljaju.");
		} else {
			System.out.println("Nema istih karaktera");
		}
	}
}