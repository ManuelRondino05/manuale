package settimaLezione;

public class Edificio {

	String Nome = "Ex-caserama";
	String Indirizzo = "Via nino bixio";
	int MetraturaMq = 3000; 
	void visita() {
		System.out.println("L'edificio che sto visitando è: "+Nome);
	}
	void locazione() {
		System.out.println("L'edificio si trova in: " +Indirizzo);
	}
	void dimensione() {
		System.out.println("l'edificio "+Nome+" ha una metratura pari a " + MetraturaMq );
		int numero = 2;
		System.out.println("Il numero selezionato: "+numero);
		this.stocazzo(numero);
	}
	void stocazzo(int numero) {
		System.out.println("ripeto il numero selezionato è: "+numero);
	}
}
