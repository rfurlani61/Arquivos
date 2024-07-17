package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamLeitura {

	public static void main(String[] args) {
		String caminho = "c:\\temp\\exemplo.txt";
		
		
		//FileReader fr = null; => Não mais necessário devido ao bloco try-with-resources dentro da chamada try
		//BufferedReader br = null; => Não mais necessário devido ao bloco try-with-resources dentro da chamada try
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			// fr = new FileReader(caminho); => Não mais necessário devido ao bloco try-with-resources dentro da chamada try
			// br = new BufferedReader(fr); => Não mais necessário devido ao bloco try-with-resources dentro da chamada try
			// br = new BufferedReader(new FileReader(caminho)); ou colocar tudo diretamente na chamada de BufferedReader.
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
/*		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) { 
					br.close();					=> Não mais necessário devido ao bloco try-with-resources dentro da chamada try
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}

	}
	*/	
		
		
	}

}
