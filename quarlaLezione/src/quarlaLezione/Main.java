package quarlaLezione;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int[] numeri = new int[4];
		numeri[0] = 1;
		numeri[1] = 2;
		numeri[2] = 3;
		numeri[3] = 4;
		System.out.println(numeri[0]);
		numeri[0] = 9;
		System.out.println(numeri[0]);
	*/
		int[] numeri = {1,2,3,4,5};
		System.out.println(numeri.length); // se bisogna sapere la lunghezza dell'array viene utilizzato il metodo length
		System.out.println(numeri[numeri.length-1]);
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
	for( int numero : numeri) {
		System.out.println(numero);
	}
		
		
		
	}

}
