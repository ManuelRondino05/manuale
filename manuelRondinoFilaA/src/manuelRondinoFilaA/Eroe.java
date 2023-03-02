package manuelRondinoFilaA;

public class Eroe implements Personaggio,  Umano {
	
	int forzaFisica= 10;
	Eroe(int  forzaFisica){
		this.forzaFisica = forzaFisica;
	}
	
	@Override
	public void getForza() {
		// TODO Auto-generated method stub
		System.out.println("la sua forza è: ");
		
		
	}

	@Override
	public void combattere() {
		// TODO Auto-generated method stub
		
		System.out.println("l'eroe combatte il secondo scontro con 7 di vita con il l'icantropo");
		System.out.println("l'eroe combatte il terzo scontro con 4 di vita con il vampiro");
	}
	public int getForzafisica() {
		return forzaFisica;
	}
	public void setForzaFisica(int forzaFisica) {
		this.forzaFisica = forzaFisica;
	}
	
	

}
