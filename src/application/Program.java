package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\exemplo.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close(); 
				// Se ocorreu uma exceção o Scanner não foi instanciado e se tentassemos fechar teríamos um
				// NULL.EXCEPTION, então temos de testar se o Scanner foi ou não instanciado antes de fechá-lo.
			}
		}
	}
}
