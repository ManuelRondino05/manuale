package dodicesimaLezioneEstesa;

public class Pesce implements Preda, Predatore  {

	@Override
	public void Caccia() {
		// TODO Auto-generated method stub
		System.out.println("Il pesce grosso caccia i pesci piccoli");
		
	}

	@Override
	public void Scappa() {
		// TODO Auto-generated method stub
		System.out.println("Il pesce piccolo scappa dal pesce grosso");
		
	}
	

}
