package tredicesimaLezione;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente studente = new Studente("Manuel", "Rondino");
		Studente studente2 = new Studente("Enea", "Prifti");
		Studente studente3 = new Studente("Leonardo", "Muratori");
		Studente studente4 = new Studente("Antonio", "Piedimonte");
		Docente docente = new Docente("Simone", "Manfroni");
		//studente.salutare();
		//docente.salutare();
		Persona[] classe = {studente, studente2, studente3, studente4, docente};
		for(Persona individuo : classe) {
			individuo.salutare();
			
			
			
		}
		


	}

}
