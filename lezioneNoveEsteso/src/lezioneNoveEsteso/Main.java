package lezioneNoveEsteso;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Manuel","Rondino");
		Persona persona2 = new Persona("Enea","Prifti");
		Persona persona3 = new Persona("Nico","Ma");

		Studente studente1 = new Studente("Manuel", "Rondino", "Sistemi e reti");
		System.out.println("Alunno: "+ studente1);
		studente1.studiare();
		System.out.println();
		Docente docente1 = new Docente ("Gianfranco", "uhuhuh", "Sitemi e reti");
		System.out.println("Docente: "+ docente1);
		docente1.insegnare();
		System.out.println();
		studente1.salutare();
		docente1.salutare();
		
		
	}
}
