package esercizioPesce;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quanti pesci vuoi inserire:");
		int inserisci = 0;
		inserisci = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < inserisci; i++) {
			System.out.println("Inserisci i dati del " + (i+1) + "° pesce");
			
			System.out.println("Inserisci la dimensione in cm: ");
			 double dimensione = scanner.nextInt();
			System.out.println("Inserisci l'indole del pesce(buona o cattiva): ");
			String indole = scanner.next();
			Pesce pesce = new Pesce(dimensione,indole);
			System.out.println(pesce);
			System.out.println("Il pesce è un predatore? " + pesce.isPredatore(inserisci, indole));
			 System.out.println("Il pesce è una preda? " + pesce.isPreda(inserisci, indole));
			 System.out.println();
	 }

	}
 
 }
