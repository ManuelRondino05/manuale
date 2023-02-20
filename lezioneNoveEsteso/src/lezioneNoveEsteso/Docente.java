package lezioneNoveEsteso;

public class Docente extends Persona{
	String materiaInsegnata;

	Docente(String nome, String cognome, String materiaInsegnata) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.materiaInsegnata = materiaInsegnata;
	}
void insegnare() {
	System.out.println("Sto insegnando: "+materiaInsegnata);
}
@Override
public void salutare() {
	System.out.println("Buongiorno! sono: " + nome+" "+cognome);
	
}
}
