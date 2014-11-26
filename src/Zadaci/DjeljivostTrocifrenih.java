package Zadaci;

public class DjeljivostTrocifrenih {
public static void main(String[] args) {
	System.out.println("Unesite neki broj.");
	int djelioc = TextIO.getlnInt();
	System.out.println(trocifreniBrojevi(djelioc));
}
/**
 * funkcija ispisuje sve trocifrene brojeve koji su djeljivi sa brojem kojeg unosi korisnik
 * @param broj kojeg unosi korisnik
 * @return trocifreni brojevi djeljivi sa zadanim brojem
 */
public static String trocifreniBrojevi(int djelioc){
	String broj = " ";
	for (int i = 100; i < 1000; i++){
		if (i % djelioc == 0){
			broj = broj + i + ",";
		}	
	}
	
	return broj;
}
}
