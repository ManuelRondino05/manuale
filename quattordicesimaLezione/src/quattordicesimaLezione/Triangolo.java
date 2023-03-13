package quattordicesimaLezione;

public class Triangolo extends Figura{
	double lato1;
	double lato2;
	double lato3;
	Triangolo(double lato1, double lato2, double lato3){
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	public void perimetro() {
		System.out.println("Il perimetro del triangolo è: " +(lato1 +lato2 + lato3));
		
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
