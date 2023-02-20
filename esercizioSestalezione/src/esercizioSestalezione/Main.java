package esercizioSestalezione;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insersci quanti numeri vuoi ");
		int inserisci = 0;
		inserisci= scanner.nextInt();
		int[]array = new int[inserisci];
		for(int i = 0; i <inserisci;i++) {
			System.out.println("Insersci il primo numero nela posizione: "+(i+1) );
			array[i]= scanner.nextInt();
			scanner.nextLine();
		}
		
		ordinamento(array);
		
	}
		static void ordinamento(int[] array){
			for(int i = 0; i <array.length-1; i++) {
				for(int j = i+1; j<array.length; j++) {
					if(array[i]<array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
				}
			}
		}
			
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}