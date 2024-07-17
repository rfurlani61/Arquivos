package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamLeitura {

	public static void main(String[] args) {
		String caminho = "c:\\temp\\exemplo.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho); 
			br = new BufferedReader(fr);
			// br = new BufferedReader(new FileReader(caminho)); ou colocar tudo diretamente na chamada de BuffredReader.
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
