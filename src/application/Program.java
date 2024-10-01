package application;

import java.util.Scanner;

import entities.VerificarLetra;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite uma string: ");
		String nomeInserido = sc.nextLine();
		
		VerificarLetra a1 = new VerificarLetra(nomeInserido);
		
		a1.verificarString();
		
		sc.close();

	}

}
