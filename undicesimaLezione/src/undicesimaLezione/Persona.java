package undicesimaLezione;

public class Persona {
	private String Nome;
	private String Cognome;
	Persona(String Nome, String Cognome){
		this.Nome = Nome;
		this.Cognome = Cognome;
	}
	public String getNome(){
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String Cognome) {
		this.Cognome = Cognome;
	}
}
