package quattordicesimaLezione;

public class Rombo extends Quadrilatero {
	double lato1;
	double lato2;
	
	Rombo(double lato1, double lato2){
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	public void perimetro() {
		System.out.println("Il perimetro del rombo è: " +((lato1)*2 +(lato2)*2));
	}

}