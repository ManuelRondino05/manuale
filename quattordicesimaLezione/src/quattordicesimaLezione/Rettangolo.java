package quattordicesimaLezione;

public class Rettangolo extends Quadrilatero {
	double lato1;
	double lato2;
	double lato3;
	double lato4;
	Rettangolo(double lato1, double lato2,	double lato3, double lato4){
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.lato4 = lato4;
	}
	
	public void perimetro() {
		System.out.println("Il perimetro del rettangolo è: " + (lato1 +lato2 + lato3 + lato4));
	}

}