package ottavaLezione;

public class Edificio {
	String Nome;
	String Indirizzo;
	int MetraturaMq;
	Edificio(String Nome, String Indirizzo, int MetraturaMq ){
		this.Nome = Nome;
		this.Indirizzo = Indirizzo;
		this.MetraturaMq = MetraturaMq;	
	}
	public String toString() {
	String testo = this.Nome + " " + this.Indirizzo + " " + this.MetraturaMq;
	return testo;
	 }
}
