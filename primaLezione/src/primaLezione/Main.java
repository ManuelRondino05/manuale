package primaLezione;
public class Main {

	public static void main(String[] args) {
		
int a = 1;
int b = 3;
int c = -10;
int d;
double x1;
double x2;
d= (b*b)-4*a*c;

if (d > 0) {
	x1 = (-b+Math.sqrt(d))/(2*a);
	x2 = (-b-Math.sqrt(d))/(2*a);
	System.out.print("Il risulato di x1 è:");
	System.out.println(x1);
	System.out.print("Il risulato di x2 è:");
	System.out.println(x2);
}

if (d==0) {
	x1 = (-b+Math.sqrt(d))/(2*a);
	x2 = x1;
	System.out.println("Il risulato è 0");
	System.out.println(x1);
}

if (d < 0) {
	System.out.println("Il risulato è impossibile");
	}

	
  }
}