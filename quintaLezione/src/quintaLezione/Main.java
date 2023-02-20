package quintaLezione;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[][]classe= {
								{"Andrea", "Giovi"},
								{"Leo", "Zoccola"},
								{"Tossico", "Wimney"}
		};
		*/
		/*ArrayList<String>Ominidi= new ArrayList<String>();
			Ominidi.add("seraf");//add permette di aggiungeri valori all'array list
			Ominidi.add("giovi");
			Ominidi.add("Leo");
				//System.out.println(Ominidi.get(0)); // stampo solo un valore, il get prendo un valore 
				for(int i= 0; i<Ominidi.size(); i++) { // stampo tutti i valori, size è la dimensione della stringa
						System.out.println(Ominidi.get(i));
				}
			System.out.println("---------------------------------- ");
			Ominidi.set(1, "tossico");	
			for(int i= 0; i<Ominidi.size(); i++) { // stampo tutti i valori, size è la dimensione della stringa
				System.out.println(Ominidi.get(i));
		}
			System.out.println("---------------------------------- ");
			Ominidi.remove(0);	
			for(int i= 0; i<Ominidi.size(); i++) { // stampo tutti i valori, size è la dimensione della stringa
				System.out.println(Ominidi.get(i));
			}
			*/
			
			ArrayList<ArrayList<String>>Rubrica = new ArrayList<ArrayList<String>>();
			ArrayList<String>persona1 = new ArrayList<String>();
			persona1.add("Alex");
			persona1.add("baldelli");
			persona1.add("3200406967");
			ArrayList<String>persona2 = new ArrayList<String>();
			persona2.add("Manuel");
			persona2.add("Rondino");
			persona2.add("3483535683");
			Rubrica.add(persona1);
			Rubrica.add(persona2);
			System.out.println(Rubrica.get(1));
			for(int i = 0; i< Rubrica.size(); i++) {
				for(int j = 0; j<Rubrica.get(i).size(); j++) {
					
						System.out.println(Rubrica.get(i).get(j));
					
				}
				
			}
		
			
		}

	}
