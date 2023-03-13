package quattordicesimaLezione;

public class Trapezio extends Quadrilatero {
	double B;
	double b;
	double lato1;
	double lato2;
	Trapezio(double B,double b,double lato1,double lato2){
		this.B =B;
		this.b = b;
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	public void perimetro() {
		System.out.println("Il perimetro del trapezio è: " + (B+b+lato1+lato2));
	}
	
}
