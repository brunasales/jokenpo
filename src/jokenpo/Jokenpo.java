package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------------------");
		
		System.out.println("\n JOKENPO");
		
		System.out.println("----------------------------");
		
		System.out.println("1 - Pedra \n2 - Papel \n3- Tesoura");
		
		System.out.println("----------------------------");
		
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		
		System.out.print("Escolha uma opção: ");
		int escolhaDoUsuario = leitor.nextInt();
		
		if (escolhaDoUsuario == 1) {
			System.out.println("\nVocê escolheu: Pedra");
			} 
		if (escolhaDoUsuario == 2) {
				System.out.println("\nVocê escolheu: Papel");
			} 
		if (escolhaDoUsuario == 3) {
				System.out.println("\nVocê escolheu: Tesoura");
			}
		
		Random aleatorio = new Random();
		
		int escolhaDoPc = aleatorio.nextInt(3) + 1;
		if (escolhaDoPc == 1) {
			System.out.println("Computador escolheu: Pedra");
			} 
		if (escolhaDoPc == 2) {
			System.out.println("Computador escolheu: Papel");
			} 
		if (escolhaDoPc == 3) {
			System.out.println("Computador escolheu: Tesoura");
			}
		
		if(escolhaDoUsuario == pedra && escolhaDoPc == pedra) {
			System.out.println("Empate :/");
		} else if(escolhaDoUsuario == pedra && escolhaDoPc == papel) {
			System.out.println("Você perdeu :(");
		} else if (escolhaDoUsuario == pedra && escolhaDoPc == tesoura) {
			System.out.println("Você ganhou! :D");
		} else if(escolhaDoUsuario == papel && escolhaDoPc == papel) {
			System.out.println("Empate :/");
		} else if(escolhaDoUsuario == papel && escolhaDoPc == pedra) {
			System.out.println("Você ganhou! :D");
		} else if (escolhaDoUsuario == papel && escolhaDoPc == tesoura) {
			System.out.println("Você perdeu :(");
		}else if(escolhaDoUsuario == tesoura && escolhaDoPc == tesoura) {
			System.out.println("Empate :/");
		} else if(escolhaDoUsuario == tesoura && escolhaDoPc == papel) {
			System.out.println("Você ganhou! :D");
		} else if (escolhaDoUsuario == tesoura && escolhaDoPc == pedra) {
			System.out.println("Você perdeu :(");
		}
		
		leitor.close();
		
	}

}
