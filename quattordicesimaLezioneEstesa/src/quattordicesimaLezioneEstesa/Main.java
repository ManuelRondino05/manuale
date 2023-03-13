package quattordicesimaLezioneEstesa;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			System.out.println(x);
			int y = scanner.nextInt();
			System.out.println(y);
			int risultato = x/y;
			System.out.println("il risultato è: " + risultato);
		}catch(InputMismatchException pi) {
			System.out.println("NON SI PUO FARE QUESTA OPERAZIONE");
		}catch (ArithmeticException pippo){
				System.out.println("NON SI PUO DIVIDERE PER ZERO");
			}catch (Exception nicomanero) {
				System.out.println("Scemo");
			}finally {
			scanner.close();	
			
		}
		}
		}

