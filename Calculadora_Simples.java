/*
Fa�a um programa que implemente uma calculadora, com as 4 opera��es b�sicas. Ao executar o
programa, deve aparecer o seguinte menu abaixo:
1. Somar
2. Subtrair
3. Dividir
4. Multiplicar
Ao ler a opera��o selecionada pelo usu�rio, o programa deve realizar a opera��o escolhida
Cada opera��o deve ser feita dentro de uma fun��o.
Algumas valida��es devem ser feitas.
Para todas a opera��es, os valores n�o podem ser maior que 1000. Se for, mostrar uma
mensagem para o usu�rio ("valor inv�lido") e n�o realizar a opera��o.
Para a opera��o de "dividir" n�o pode aceitar divis�o por 0. Se ocorrer mostrar a mensagem
"n�o � poss�vel dividir por 0".
*/

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		int menu;
		float valorA, valorB;
		double soma, subtrai, dividi, multiplica;
		
		// Cria��o do objeto Scanner
		Scanner input = new Scanner(System.in);
		
		// Obtendo com o usu�rio a op��o da calculadora
		do {
			System.out.print("Bem vindo a Calculadora B�sica");
			System.out.print("\nDigite 1: para SOMAR");
			System.out.print("\nDigite 2: para SUBTRAIR");
			System.out.print("\nDigite 3: para DIVIDIR");
			System.out.print("\nDigite 4: para MULTIPLICAR\n");
			menu = input.nextInt();			
			if (menu < 1 || menu >4) {
				System.out.print("\nOp��o inv�lida.\n");
			}
		} while (menu < 1 || menu >4);
		
		// Obtendo com o usu�rio os valores para calcular
		do {
			System.out.print("\nDigite o primeiro valor: ");
			valorA = input.nextFloat();
			if (valorA > 1000) {
				System.out.print("\nValor inv�lido. Digite um valor menor ou igual a '1000'\n");
			}
		} while (valorA > 1000);
		
		do {
			System.out.print("\nDigite o segundo valor: ");
			valorB = input.nextFloat();
			if (valorB > 1000) {
				System.out.print("\nValor inv�lido. Digite um valor menor ou igual a '1000'\n");
			}
			if (menu == 3 && valorB == 0) {
				System.out.print("\nN�o � poss�vel dividir por '0'.\n");
			}
		} while ((valorB > 1000) || (menu == 3 && valorB == 0));
		
		// Apresenta�ao do resultado para o usu�rio - SOMA
		if (menu == 1) {
			soma = somar(valorA,valorB);
			System.out.printf("\n%.2f", soma);
		}
		
		// Apresenta�ao do resultado para o usu�rio - SUBTRAIR
		if (menu == 2) {
			subtrai = subtrair(valorA,valorB);
			System.out.printf("\n%.2f", subtrai);
		}
		
		// Apresenta�ao do resultado para o usu�rio - DIVIDIR
		if (menu == 3) {
			dividi = dividir(valorA,valorB);
			System.out.printf("\n%.2f", dividi);
		}
		
		// Apresenta�ao do resultado para o usu�rio - MULTIPLICAR
		if (menu == 4) {
			multiplica = multiplicar(valorA,valorB);
			System.out.printf("\n%.2f", multiplica);
		}		
		input.close();		
	}
	
	// Cria��o da SOMAR
	public static double somar (float a, float b) {
		return a + b;
	}
	
	// Cria��o da SUBTRAIR
	public static double subtrair (float a, float b) {
		return a - b;
	}
	
	// Cria��o da DIVIDIR
	public static double dividir (float a, float b) {
		return a / b;
	}
	
	// Cria��o da MULTIPLICAR
	public static double multiplicar (float a, float b) {
		return a * b;
	}

}
