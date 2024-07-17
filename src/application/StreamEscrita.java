package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreamEscrita {

	public static void main(String[] args) {
		String[] lines = new String[] { "Bom Dia!", "Boa Tarde!", "Boa Noite" };
		String caminho = "c://temp//outroexemplo.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			// O argumento true não recria o arquivo, faz o append ao arquivo existente.
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}