package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("maria");
		list.add("Joao");
		list.add("marcia");
		list.add("mari");
		list.add("mercia");
		list.add("Jairo");
		list.add("Jairo");
		
		list.add(2, "Marco");
		list.remove("maria");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("-------------------- removendo apenas com determinada letras ------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0)== 'J');
		
		System.out.println("-------------------- fazendo busca de nomes ------------");
	
		System.out.println("Index of Jairo: " + list.indexOf("Jairo"));
		
		
		
		
		}

	}


