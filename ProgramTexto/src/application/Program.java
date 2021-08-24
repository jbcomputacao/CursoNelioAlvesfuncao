package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;


public class Program {
	
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment("OI como vai vc?");
		Comment c2 = new Comment("Qual seu aniversaurio");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "olha olha...", "Bosta bosta", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		
		
	}
	
	
}