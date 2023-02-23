package esercizioPizza;

public class Pizza {
	String nome;
	String impasto;
	String ingrediente1;
	String ingrediente2;
	String ingrediente3;
	String ingrediente4;
	String ingrediente5;
	String ingrediente6;
	String ingrediente7;
	String ingrediente8;
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3 ){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
	}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.ingrediente5 = ingrediente5;
	}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5, String ingrediente6){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.ingrediente5 = ingrediente5;
		this.ingrediente6 = ingrediente6;
		}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5, String ingrediente6, String ingrediente7){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.ingrediente5 = ingrediente5;
		this.ingrediente6 = ingrediente6;
		this.ingrediente7 = ingrediente7;
		}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5, String ingrediente6, String ingrediente7, String ingrediente8){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		this.ingrediente5 = ingrediente5;
		this.ingrediente6 = ingrediente6;
		this.ingrediente7 = ingrediente7;
		this.ingrediente8 = ingrediente8;
		}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
	}
	Pizza(String nome,String impasto,String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4){
		this.nome = nome;
		this.impasto = impasto;
		this.ingrediente1 = ingrediente1;
		this.ingrediente2 = ingrediente2;
		this.ingrediente3 = ingrediente3;
		this.ingrediente4 = ingrediente4;
		}
	public String toString(){
		String stampa = this.nome + " " + this.impasto + " " + this.ingrediente1 + " " + this.ingrediente2 + " " + this.ingrediente3 + " " + this.ingrediente4 + " " + this.ingrediente5 + " " + this.ingrediente6 + " " + this.ingrediente7 + " " + this.ingrediente8 + " ";
		return stampa;
	
	}
}
