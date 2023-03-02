package tredicesimaLezione;

public class Persona {
	String nome;
	String cognome;
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	public String toString() {
		String testo = this.nome + " " + this.cognome;
		return testo;
		 }

	public void salutare() {
		System.out.println("Ciao");
		
	}

}
