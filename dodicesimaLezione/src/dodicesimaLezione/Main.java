package dodicesimaLezione;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Manuel", " Rondino"); //metodo costruttore
		Persona persona2 = new Persona("Mario", " Gallo"); //metodo costruttore
		
		
		
		
		/*persona1 = persona2;
		persona1.setNome("Andrea");
		*/
		persona2.Copia(persona1); // faccio la copia con gli stessi dati   
		
		System.out.println(persona1.getNome() + persona1.getCognome()); // stampo il nome e cognome tramite il get per persona 1
		System.out.println(persona2.getNome() + persona2.getCognome()); // stampo il nome e cognome tramite il get per persona 2
		System.out.println(persona1); //Stampo le celle di memoria
		System.out.println(persona2); //Stampo le celle di memoria
		
		Persona persona3 = new Persona("Enea", " Prifti"); 
		Persona persona4 = new Persona(persona3); // metodo costruttore di COPIA
		persona3.setCognome(" friti"); // modifico il cognome o nome
		System.out.println(persona3.getNome() + persona3.getCognome()); // stampo il nome e cognome tramite il get per persona 3 
		System.out.println(persona4.getNome() + persona4.getCognome()); // stampo il nome e cognome tramite il get per persona 4
		System.out.println(persona3); //Stampo le celle di memoria
		System.out.println(persona4); //Stampo le celle di memoria
		
		
		
		
		
		

		}

	}
