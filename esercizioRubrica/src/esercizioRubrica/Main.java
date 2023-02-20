package esercizioRubrica;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Quanti contatti vuoi inserire:");
int inserisci = 0;
inserisci = scanner.nextInt();
scanner.nextLine();
ArrayList<Persona>Rubrica = new ArrayList<Persona>();
for(int i = 0; i < inserisci; i++) {
	System.out.println("Inserisci il "+(i+1)+" contatto");
	Persona persona = new Persona();
	System.out.print("Nome: ");
	persona.setNome(scanner.nextLine());
	System.out.print("Cognome: ");
	persona.setCognome(scanner.nextLine());
	System.out.print("Email: ");
	persona.setEmail(scanner.nextLine());
	System.out.print("Telefono: ");
	persona.setNumero(scanner.nextLine());
	Rubrica.add(persona);
}
ordinamento(Rubrica);
for(int i =0; i < Rubrica.size(); i++) {
	System.out.println(Rubrica.get(i));
	}
}
static void ordinamento(ArrayList<Persona>Rubrica) {
for (int i = 0; i < Rubrica.size()-1; i++ ) {
	for(int j = i+1; j < Rubrica.size(); j++) {
		if(Rubrica.get(i).getCognome().compareTo(Rubrica.get(j).getCognome())>0){
			Persona temp=Rubrica.get(i);
			Rubrica.set( i, Rubrica.get(j) );
			Rubrica.set( j, temp );
		}
	}
	}
	}
}
