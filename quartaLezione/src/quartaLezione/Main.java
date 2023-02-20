package quartaLezione;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[][] fili = new String [2][2];
 fili[0][0] = "Alex";
 fili[0][1] = "Manuel";
 fili[1][0] = "Enea";
 fili[1][1] = "Enrico";

 
 for (int i = 0; i < fili.length; i++) {
	 for(int j = 0; j< fili[i].length; j++) {
		 System.out.println(fili[i][j]+"\t");
	 }
 }
 
 
	}

}
