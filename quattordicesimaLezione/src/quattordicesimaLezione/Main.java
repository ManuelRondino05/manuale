package quattordicesimaLezione;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Figura triangolo = new Triangolo(1,5,8);
		triangolo.perimetro();
		
		Figura rombo = new Rombo(8,4);
		rombo.perimetro();
		
		Figura rettangolo = new Rettangolo(5,8,7,6);
		rettangolo.perimetro();
		
		Figura quadrato = new Quadrato(5,8,4,6);
		quadrato.perimetro();
		
		Figura parallelogramma = new Parallelogramma(4,5);
		parallelogramma.perimetro();
		
		Figura trapezio = new Trapezio(8,4,7,6);
		trapezio.perimetro();	
	}
}
