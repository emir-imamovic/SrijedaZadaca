package Zadaci;

public class Djeljivost5711 {
public static void main(String[] args) {
	System.out.println("Unesite broj.");
	int broj = TextIO.getlnInt();
	System.out.println("Brojevi koji su djeljivi sa 5,7 ili 11 su: " + djeljiviBrojevi(broj));
}
/**
 * funkcija daje brojeve koji su manji ili jednaki unesenom broju,a djeljivi su sa 5,7 ili 11
 * @param broj koji korisnik unosi
 * @return brojevi koji su djeljivi sa 5,7 ili 11
 */
public static String djeljiviBrojevi(int broj){
	String djeljivi = "";
	for (int i = broj; i > 0; i--){
		if (i % 5 == 0 || i % 7 == 0 || i % 11 == 0){
			djeljivi = djeljivi + i + ",";
		}
	}
	return djeljivi;
}
}
