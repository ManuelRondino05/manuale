package lezioneNoveEsteso;

public class Studente extends Persona{
String materiaPreferita;
	Studente(String nome, String cognome,  String materiaPreferita) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.materiaPreferita = materiaPreferita;
	}
	void studiare() {
		System.out.println("Sto studiando: " + materiaPreferita);
	}
	@ Override
	public void salutare() {
		System.out.println("Buongiorno! sono: "+ nome+ " "+ cognome+ " ");
		
	}
	

}
