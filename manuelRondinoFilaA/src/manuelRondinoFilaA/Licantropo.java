package manuelRondinoFilaA;

public class Licantropo implements Umano, Mostro {

	int forzaFisica = 10;
	int forzaFisica2 = 15;
	
	
	Licantropo(int  forzaFisica,int forzaFisica2 ){
		this.forzaFisica = forzaFisica;
		this.forzaFisica2 = forzaFisica2;
		
	}
	@Override
	public void Azzanare() {
		// TODO Auto-generated method stub
		System.out.println("Il licantropo combatte il primo scontro con 15 di vita con l'eroe");
		System.out.println("Il licantropo azzanna e perde 2 di forza fisica");
	}

	@Override
	public void combattere() {
		// TODO Auto-generated method stub
		System.out.println("Il licantropo combatte da umano il primo scontro con 10 di vita con il vampiro");
		System.out.println("Il licantropo combatte e perde 3 di forza fisica");
		
	}
	
	 public boolean isLupo(int forzafisica2, int forzafisica) {
		return ((forzafisica2 >= 15) || (forzafisica2 < 10));
    }
	public boolean isUmano( int forzaFisica, int forzafisica) {
		return ((forzaFisica <= 10) || (forzaFisica >= 15 ));
    }

	

}
