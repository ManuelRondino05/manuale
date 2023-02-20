package terzaLezione;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	/*Scanner scanner = new Scanner(System.in);
	String x = scanner.nextLine();
	String z = x=="A"? "Artibani":"BAldelli";
	*/
		Scanner scanner = new Scanner(System.in); 
		String[]studente1 = {"Nome1", "Cognome1", "Comune1", "Eta1"};
		studente1[0] = scanner.nextLine(); 
		System.out.println("Inserisci il nome:");
		studente1[1]= scanner.nextLine();
		System.out.println("inserisci il cognome:");
		studente1[2] = scanner.nextLine();
		System.out.println("inserisci il comune:");
		studente1[3] = scanner.nextLine();
		System.out.println("Inserisci Eta");
		
		String[]studente2 = {"Nome2", "Cognome2", "Comune2", "Eta2"};
		studente2[0] = scanner.nextLine(); 
		System.out.println("Inserisci il nome:");
		studente2[1]= scanner.nextLine();
		System.out.println("inserisci il cognome:");
		studente2[2] = scanner.nextLine();
		System.out.println("inserisci il comune:");
		studente2[3] = scanner.nextLine();
		System.out.println("Inserisci Eta");;
		


	
		if (Integer.valueOf(studente1[4])> Integer.valueOf(studente2[4])) {
			System.out.println("L'alunno con l'eta maggiore ha: "+studente1);
		} else{
			System.out.println("L'alunno con l'eta minore ha:"+studente2);
	}
	}
}
