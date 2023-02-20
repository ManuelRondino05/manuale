package settimaLezione;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edificio edificio1 = new Edificio(); //costruttore
		Edificio edificio2 = new Edificio(); //costruttore
		edificio1.visita();
		edificio1.locazione();
		edificio1.dimensione();
		System.out.println(edificio2.Nome);
		Prova prova1 = new Prova("Pincio", "Giardini", 1000);
		Prova prova2 = new Prova("Arco d'Augusto", "Via arco d'augusto", 500);
		System.out.println(prova1.Nome);
		System.out.println(prova1.Indirizzo);
		System.out.println(prova1.MetraturaMq);
		System.out.println(prova2.Nome);
		System.out.println(prova2.Indirizzo);
		System.out.println(prova2.MetraturaMq);
		edificio1.dimensione();
		edificio1.stocazzo(7);
		edificio1.dimensione();
		
	}

}
