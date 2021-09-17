package desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogo {

	public static void main(String[] args) {
		
		int valorvitoria = 0;
		int numpartidas = 0;
		int cont = 0;
		int vitoriasusuario = 0;
		int vitoriascomp = 0;
		int empate = 0;
		int escolhahum = 0;
		int escolhacomp = 0;
		String jogarnovamente = "S";
		String nomeescolhacomp = "";
		String nomeescolhahum = "";
		
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		
		
		System.out.println("----------------------------");
		System.out.println("      J O K E N P O         ");
		System.out.println("----------------------------");
		System.out.println();
		
		
		while (jogarnovamente.equalsIgnoreCase("s")){
		
		System.out.print("Quantas partidas: ");
		numpartidas = leitor.nextInt();
		
		while (numpartidas % 2 == 0 || numpartidas < 3) {
			System.out.println();
			System.out.println("Número de partidas inserido inválido");
			System.out.println();
			System.out.print("Digite novamente quantas partidas: ");
			numpartidas = leitor.nextInt();}
			
		    System.out.println();
		    valorvitoria = (numpartidas /2) + 1;
		    System.out.println("O valor da vitoria é " + valorvitoria);
		    
			while (cont < numpartidas) {
				
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println();
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println();
				
				escolhacomp = sorteio.nextInt(3)+1;
				
				System.out.println();
				System.out.println("Rodada " + (cont + 1));
				
				if (escolhacomp == 1) {
					nomeescolhacomp = "Pedra";
				} else if (escolhacomp == 2) {
					nomeescolhacomp = "Papel";
				} else {
					nomeescolhacomp = "Tesoura";
				}
				
				System.out.print("Escolha uma opção [1 à 3]: ");
				escolhahum = leitor.nextInt();
				
				while ( escolhahum < 1 || escolhahum > 3) {
					System.out.println();
					System.out.println("Valor inserido ínvalido");
					System.out.println();
					System.out.print("Digite sua escolha novamente: ");
					escolhahum = leitor.nextInt();
				}
				
				if (escolhahum == 1) {
					nomeescolhahum = "Pedra";
				} else if (escolhahum == 2) {
					nomeescolhahum = "Papel";
				} else {
					nomeescolhahum = "Tesoura";
				}
				
				System.out.println("Você escolheu: " + nomeescolhahum);
				System.out.println("O computador escolheu: " + nomeescolhacomp);
				
				if (escolhahum == 1){
					if (escolhacomp == 1) {
						empate++;
						System.out.println("E M P A T E ! !");
					} else if (escolhacomp == 2) {
						vitoriascomp++;
						System.out.println("C O M P U T A D O R  V E N C E U ! !");
					} else {
						vitoriasusuario++;
						System.out.println("H U M A N O  V E N C E U ! !");
					}
				}

				if (escolhahum == 2) {
					if (escolhacomp == 1) {
						vitoriasusuario++;
						System.out.println("H U M A N O  V E N C E U ! !");
					} else if (escolhacomp == 2) {
						empate++;
						System.out.println("E M P A T E ! !");
					} else {
						vitoriascomp++;
						System.out.println("C O M P U T A D O R  V E N C E U ! !");
					}
				}

				if (escolhahum == 3) {
					if (escolhacomp == 1) {
						vitoriascomp++;
						System.out.println("C O M P U T A D O R  V E N C E U ! !");
					} else if (escolhacomp == 2) {
						vitoriasusuario++;
						System.out.println("H U M A N O  V E N C E U ! !");
					} else {
						empate++;
						System.out.println("E M P A T E ! !");
					}
				}
				
				cont++;
				
				if (vitoriascomp == valorvitoria){
					System.out.println();
					System.out.println("O computador venceu o desafio");
					System.out.println();
					System.out.println("Computador: " + vitoriascomp);
					System.out.println("Você: " + vitoriasusuario);
					System.out.println("Empate: " + empate);
					cont = numpartidas;
				} else if (vitoriasusuario == valorvitoria){
					System.out.println();
					System.out.println("O usuário venceu o desafio");
					System.out.println();
					System.out.println("Computador: " + vitoriascomp);
					System.out.println("Você: " + vitoriasusuario);
					System.out.println("Empate: " + empate);
					cont = numpartidas;
				} else if (cont == valorvitoria){
					numpartidas++;
				}
			
			}
			
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("             J O G O  A C A B O U ! !");
			System.out.println("------------------------------------------------");
			System.out.println();
			System.out.print("Deseja desafiar o computador novamente (S/N)? ");
			jogarnovamente = leitor.next();
			
			valorvitoria = 0;
			numpartidas = 0;
			cont = 0;
			vitoriasusuario = 0;
			vitoriascomp = 0;
			empate = 0;
			escolhahum = 0;
			escolhacomp = 0;
			
		}
		
		System.out.println();
		System.out.println("F I M  D O  J O G O ! ! !");
		System.out.println("B Y E  B Y E ! ! !");

				
				
	}
			
}	
			
			
			
				
	
	
	
			
		
		
	
		
		


	


