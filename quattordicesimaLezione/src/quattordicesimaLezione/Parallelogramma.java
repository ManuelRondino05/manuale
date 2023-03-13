package quattordicesimaLezione;

public class Parallelogramma extends Quadrilatero {
	double base;
	double lato;
	
	Parallelogramma(double base, double lato){
		this.base = base;
		this.lato = lato;
	}
	public void perimetro() {
		System.out.println("Il perimetro del parallelogramma è: " + (base + lato)*(2));
	}
}