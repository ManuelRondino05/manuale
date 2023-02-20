package sestaLezione;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		faiColazione("Sambuca");
		faiColazione("Latte");
		faiColazione("Latte e Biscotti");
		faiColazione("Frutta");
		int somma1 = somma(9,8);
		System.out.println(somma1);
		int somma2 = somma(98, 56)+somma(2789,5689);
		System.out.println(somma2);
		System.out.println(somma(2,9));
		System.out.println(somma(9,6,2));
		System.out.println(somma(3.5,7.9));
		}
	static void faiColazione(String Colazione) {
		System.out.println("Oggi faccio colazione con "+ Colazione);
		
	}
	static int somma(int x, int y){
		int risultato=x+y;
		return risultato;	
	}
	static int somma(int x, int y, int z){
		int risultato=x+y;
		return risultato;
	}
		static double somma(double x, double y){
			double risultato= x + y;
			return risultato;
		}
}