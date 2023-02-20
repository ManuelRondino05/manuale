package esercizioRubrica;

public class Persona {
	String Nome;
	String Cognome;
	String Numero;
	String Email;
	 Persona() {

		}
	public Persona(String Nome, String Cognome, String Email, String Numero){
	this.Nome= Nome;	
	this.Cognome= Cognome;
	this.Email= Email;
	this.Numero= Numero;
	}
	public String getNome() {
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
	public String getEmail() {
	return Email;
	}	
	public void setEmail(String Email) {
	this.Email = Email;
	}
	public String getNumero() {
	return Numero;
	}
	public void setNumero(String Numero) {
	this.Numero = Numero;
	}
	public String toString() {
	return " Nome: " + Nome + " | Cognome: " + Cognome + " | Email: " + Email + " | Numero Telefonico: " + Numero;
		}
}
