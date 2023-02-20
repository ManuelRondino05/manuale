package nonaLezione;

public class Persona {
	String nome;
	String cognome;
	static int personeAggiunte;
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		personeAggiunte++;
		System.out.println(personeAggiunte);
	}
	public String toString() {
		String testo = this.nome + " " + this.cognome;
		return testo;
		 }
	static void persona() {
		System.out.println("totale persone " + Persona.personeAggiunte);
		
	}
	}

