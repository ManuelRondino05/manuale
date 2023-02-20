package secondaLezione;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //Si crea lo scanner per inserire i dati in input
		String Nome = scanner.nextLine(); // Inserisco in input il valore tramite il comando nextLine
		String Cognome = scanner.nextLine();  // Inserisco in input il valore tramite il comando nextLine
		String Comune = scanner.nextLine();  // Inserisco in input il valore tramite il comando nextLine
		int Eta = scanner.nextInt();  // Inserisco in input il valore tramite il comando nextLine
		scanner.nextLine(); // inserisco il comando per andare a capo
		System.out.println("l'alunno si chiama:"+Nome+" "+Cognome); //Stampo i valori
		System.out.println("L'alunno abita:"+Comune+";");  //Stampo i valori
		System.out.println("L'alunno ha: "+Eta+ " anni");  //Stampo i valori
		scanner.close(); // chiudo lo scanner
		 

	}

}
