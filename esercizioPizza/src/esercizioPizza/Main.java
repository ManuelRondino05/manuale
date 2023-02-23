package esercizioPizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" _______________BENVENUTI IN PIZZERIA, QUESTE SONO LE PIZZE CHE POTETE SCEGLIERE._______________  ");
		System.out.println(" ");
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza Margherita = new Pizza("| Margherita: ", "Farina00", "Pomodoro", "Mozzarella", "Basilico");
		System.out.println(Margherita);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza SalsicciaPatatine = new Pizza("| Salsciccia e Patatine: ", "Farina00", "Pomodoro", "Mozzarella", "Salsiccia", "Patatine");
		System.out.println(SalsicciaPatatine);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza Diavola = new Pizza("| Diavola: ", "Farina00", "Pomodoro", "Mozzarella", "Salame piccante");
		System.out.println(Diavola);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza WurstelPatatine = new Pizza("| Wurstel e patatine: ", "Farina00", "Pomodoro", "Mozzarella", "Wurstel", "Patatine");
		System.out.println(WurstelPatatine);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza Capricciosa = new Pizza("| Capricciosa: ", "Farina00", "Pomodoro", "Mozzarella", "Prosciutto cotto", "Carciofini", "Olive", "Funghi");
		System.out.println(Capricciosa);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza Marinara = new Pizza("| Marinara: ", "Farina00", "Pomodoro", "Origano", "Aglio");
		System.out.println(Marinara);
		System.out.println("|_______________________________________________________________________________________________| ");
		Pizza SalsicciaFriarelli = new Pizza("| Salsiccia e Friarelli: ", "Farina00", "Salsiccia", "Friarelli", "Peperoncino", "Olio");
		System.out.println(SalsicciaFriarelli);
		System.out.println("|_______________________________________________________________________________________________| ");

		Margherita.toString();
		SalsicciaPatatine.toString();
		Diavola.toString();
		WurstelPatatine.toString();
		Capricciosa.toString();
		Marinara.toString();
		SalsicciaFriarelli.toString();
	}

}
