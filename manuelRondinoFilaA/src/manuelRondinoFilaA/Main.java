package manuelRondinoFilaA;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Eroe eroe1 = new Eroe(10);
		Vampiro vampiro1 = new Vampiro(15);		
		Licantropo licantropo1 = new Licantropo(10,15);

		eroe1.combattere();
		System.out.println();
		vampiro1.Azzanare();
		System.out.println();
		
		System.out.println();
		System.out.println("Il licantropo è un mostro? " + licantropo1.isLupo(11, 10));
		licantropo1.Azzanare();
		System.out.println("Il licantropo è un uomo? " + licantropo1.isUmano(10, 10 ));
		licantropo1.combattere();
		System.out.println();
		

	}

}
