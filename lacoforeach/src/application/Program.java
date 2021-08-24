package application;

public class Program {

	public static void main(String[] args) {
	
		String[] vect  = new String[] {"Maria", "Bob", "Alex"};
		System.out.println("--------------- Laço for normal com vetor");
		for (int i=0; i < vect.length; i++) {
		System.out.println(vect[i]);
		

	}
		System.out.println("-------------Laço for each com vetor --------------------");
		for (String obj : vect) {
		System.out.println(obj);
		
		}
	}

}
