package leitura_de_teclado;

import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		//Note o "nextLine". Para ler apenas a próxima palavra usa-se "next"
		//Para ler um dado que não seja uma string insira o tipo após "next"
		//Por exemplo, nextInt, para ler um inteiro ou nextDouble, para ler um double, por exemplo
		
		
		System.out.println("Seu nome é: " + nomeCompleto);
		
		
		var resultado = 1 + 2;
		System.out.println("Resultado: " + resultado);
		scan.close();
	}

}
