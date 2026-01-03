package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf(" Digite o seu Titulo do Post: ");
		String t = sc.nextLine();
		System.out.printf("\n Digite o seu Conteúdo do Post: ");
		String ct = sc.nextLine();
		Post p1 = new Post(t, ct);
		System.out.printf("\n Digite o seu comentario: ");
		String cc = sc.nextLine();
		Comment c1 = new Comment(cc);
		p1.addComment(c1);
		System.out.printf(p1.toString());
		
		sc.close();
		
	}

}
