/*
Faça um programa que implemente uma calculadora, com as 4 operações básicas. Ao executar o
programa, deve aparecer o seguinte menu abaixo:
1. Somar
2. Subtrair
3. Dividir
4. Multiplicar
Ao ler a operação selecionada pelo usuário, o programa deve realizar a operação escolhida
Cada operação deve ser feita dentro de uma função.
Algumas validações devem ser feitas.
Para todas a operações, os valores não podem ser maior que 1000. Se for, mostrar uma
mensagem para o usuário ("valor inválido") e não realizar a operação.
Para a operação de "dividir" não pode aceitar divisão por 0. Se ocorrer mostrar a mensagem
"não é possível dividir por 0".
*/

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		int menu;
		float valorA, valorB;
		double soma, subtrai, dividi, multiplica;
		
		// Criação do objeto Scanner
		Scanner input = new Scanner(System.in);
		
		// Obtendo com o usuário a opção da calculadora
		do {
			System.out.print("Bem vindo a Calculadora Básica");
			System.out.print("\nDigite 1: para SOMAR");
			System.out.print("\nDigite 2: para SUBTRAIR");
			System.out.print("\nDigite 3: para DIVIDIR");
			System.out.print("\nDigite 4: para MULTIPLICAR\n");
			menu = input.nextInt();			
			if (menu < 1 || menu >4) {
				System.out.print("\nOpção inválida.\n");
			}
		} while (menu < 1 || menu >4);
		
		// Obtendo com o usuário os valores para calcular
		do {
			System.out.print("\nDigite o primeiro valor: ");
			valorA = input.nextFloat();
			if (valorA > 1000) {
				System.out.print("\nValor inválido. Digite um valor menor ou igual a '1000'\n");
			}
		} while (valorA > 1000);
		
		do {
			System.out.print("\nDigite o segundo valor: ");
			valorB = input.nextFloat();
			if (valorB > 1000) {
				System.out.print("\nValor inválido. Digite um valor menor ou igual a '1000'\n");
			}
			if (menu == 3 && valorB == 0) {
				System.out.print("\nNão é possível dividir por '0'.\n");
			}
		} while ((valorB > 1000) || (menu == 3 && valorB == 0));
		
		// Apresentaçao do resultado para o usuário - SOMA
		if (menu == 1) {
			soma = somar(valorA,valorB);
			System.out.printf("\n%.2f", soma);
		}
		
		// Apresentaçao do resultado para o usuário - SUBTRAIR
		if (menu == 2) {
			subtrai = subtrair(valorA,valorB);
			System.out.printf("\n%.2f", subtrai);
		}
		
		// Apresentaçao do resultado para o usuário - DIVIDIR
		if (menu == 3) {
			dividi = dividir(valorA,valorB);
			System.out.printf("\n%.2f", dividi);
		}
		
		// Apresentaçao do resultado para o usuário - MULTIPLICAR
		if (menu == 4) {
			multiplica = multiplicar(valorA,valorB);
			System.out.printf("\n%.2f", multiplica);
		}		
		input.close();		
	}
	
	// Criação da SOMAR
	public static double somar (float a, float b) {
		return a + b;
	}
	
	// Criação da SUBTRAIR
	public static double subtrair (float a, float b) {
		return a - b;
	}
	
	// Criação da DIVIDIR
	public static double dividir (float a, float b) {
		return a / b;
	}
	
	// Criação da MULTIPLICAR
	public static double multiplicar (float a, float b) {
		return a * b;
	}

}
