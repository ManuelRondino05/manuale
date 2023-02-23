package esercizioPesce;

public class Pesce implements Preda, Predatore{
	
	double dimensione;
	String indole;
	Pesce(double dimensione, String indole){
		
		this.dimensione = dimensione;
		this.indole = indole;
	}


	@Override
	public void Caccia() {
		// TODO Auto-generated method stub
		 System.out.println("Il pesce sta cacciando un altro pesce!");
		}
	@Override
	public void Scappa() {
		// TODO Auto-generated method stub
		System.out.println("Il pesce sta scappando!");
	}
	public double getdimensione() {
		return dimensione;
	}
	public void setdimensione(double dimensione) {
		this.dimensione = dimensione;
	}
	public String getindole() {
		return indole;
	}
	public void setindole(String indole) {
		this.indole = indole;
	}
	public boolean isPredatore(double dimensione, String indole) {
		return ((dimensione > 1 && indole.equals("cattiva")) || (dimensione < 1 && indole.equals("buona")));
    }
	public boolean isPreda(double dimensione, String indole) {
		return ((dimensione < 1 && indole.equals("cattiva")) || (dimensione > 1 && indole.equals("buona")));
    }
	public String toString() {
		return  "Dimensione: " + dimensione + " | indole: " + indole;
		}
}
