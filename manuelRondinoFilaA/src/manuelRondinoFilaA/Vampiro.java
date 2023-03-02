package manuelRondinoFilaA;

public class Vampiro implements Mostro, Personaggio{
	
	double forzaFisica = 15;
	Vampiro(int  forzaFisica){
		this.forzaFisica = forzaFisica;
	}
	@Override
	public void Azzanare() {
		// TODO Auto-generated method stub
		System.out.println("Il vampiro combatte il primo scontro con 15 di vita con l'eroe");
		System.out.println("Il vapiro azzanna e perde 2 di forza fisica");
	}



	@Override
	public void getForza() {
		// TODO Auto-generated method stub
		
		
	}

}
