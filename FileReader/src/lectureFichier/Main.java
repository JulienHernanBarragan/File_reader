package lectureFichier;

import java.io.*;

public class Main {
	public static void main(String[] args){
		
		Read_file session = new Read_file("C:/Users/Julien/Desktop/test.txt");
		
		session.readFile();
		System.out.println("---------------Contenu du fichier---------------");
		session.displayFile();
		System.out.println("---------------Contenu du fichier à l'envers---------------");
		session.displayFileUpDown();
		System.out.println("---------------Contenu du fichier en palindrome---------------");
		session.readFilePal();

	}
}
