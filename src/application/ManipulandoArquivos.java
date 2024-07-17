package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoArquivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com caminho do diretório: ");
		String strpath = sc.next();
		File path = new File(strpath);
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
//		boolean sucesso = new File(strpath + "\\novodir").mkdir();
//		System.out.println("Diretório criado com sucesso: " + sucesso);
		boolean novosucesso = new File(strpath + "\\novodir").delete();
		System.out.println("Diretório criado com sucesso: " + novosucesso);		
		
		System.out.print("Informe o arquivo: ");
		String strPath = sc.next();
		File newpath = new File(strPath);
		System.out.println("getname(): -> Só o nome do arquivo " + newpath.getName());
		System.out.println("getparent(): -> Só o diretório do arquivo " + newpath.getParent());
		System.out.println("getpath(): -> Diretório + arquivo " + newpath.getPath());
		System.out.println("getTotalSpace(): " + newpath.getTotalSpace());
		sc.close();
	}

}
