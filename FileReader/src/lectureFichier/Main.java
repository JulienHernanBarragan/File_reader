package lectureFichier;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		Read_file file = new Read_file("C:/Users/Julien/Desktop/test.txt");
		Read_file fileCompare1 = new Read_file("C:/Users/Julien/Desktop/test.txt");
		Read_file fileCompare2 = new Read_file("C:/Users/Julien/Desktop/testplus.txt");

		
		file.readFile();
		System.out.println("---------------Contenu du fichier---------------");
		file.displayFile();
		System.out.println("---------------Contenu du fichier à l'envers---------------");
		file.displayFileUpDown();
		System.out.println("---------------Contenu du fichier en palindrome---------------");
		file.readFilePal();

		// Comparaison des deux fichiers
		fileCompare1.readFile();
		fileCompare2.readFile();
		ArrayList<String> ff = fileCompare1.readFileByCara();
		ArrayList<String> ft = fileCompare2.readFileByCara();
		System.out.println("\n---------------Les fichiers sont-ils identiques ?--------------- ");

		if (ff.equals(ft)) {
			System.out.println("Oui, les fichiers sont identiques");
		} else {
			System.out.println("Non, les fichiers ne sont pas identiques");
		}
	}
}
