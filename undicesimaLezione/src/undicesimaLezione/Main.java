package undicesimaLezione;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Luca"," Corinaldesi");
		Persona persona2 = new Persona("Manuel"," Rondino");
		Persona persona3 = new Persona("Enea"," Prifti");
		Persona persona4 = new Persona("Andrea"," Serafini");
		
		System.out.print(persona1.getNome());
		System.out.println(persona1.getCognome());
		
		System.out.print(persona2.getNome());
		System.out.println(persona2.getCognome());
		
		System.out.print(persona3.getNome());
		System.out.println(persona3.getCognome());
		
		System.out.print(persona4.getNome());
		System.out.println(persona4.getCognome());
		

	}

}
