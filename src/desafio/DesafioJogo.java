package desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valorUsuario, numpartidas;
		int cont = 0;
		int vitoriasusuario = 0;
		int vitoriascomp = 0;
		String jogarnovamente = "S";
		
		System.out.println("----------------------------");
		System.out.println("      J O K E N P O         ");
		System.out.println("----------------------------");
		
		System.out.print("Quantas partidas: ");
		
		numpartidas = leitor.nextInt();
		
		if (numpartidas % 2 == 0 || numpartidas < 3) {
			System.out.println("Número de partidas inserido inválido");
		} else {
			while (cont < numpartidas && jogarnovamente.equals("S")) {
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println();
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println();
				System.out.print("Digite sua escolha(use apenas os algorismos 1, 2 ou 3: ");
				valorUsuario = leitor.nextInt();
				
				System.out.println();
				
				System.out.println("Partida " + (cont + 1));
				
				Random sorteio = new Random();
				
				int valorsorteio = sorteio.nextInt(3) + 1;
				
				if (valorUsuario == 1 && valorsorteio == 2) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(pedra)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(papel)"); 
					System.out.println();
					System.out.println("O computador ganhou!!!");
					vitoriascomp = vitoriascomp + 1;
				} else if (valorUsuario == 1 && valorsorteio == 3) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(pedra)");
					System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");  
					System.out.println();
					System.out.println("O usuário ganhou!!!");
					vitoriasusuario = vitoriasusuario + 1;
					if (numpartidas / 2 < vitoriasusuario ) {
						System.out.println("O usuario venceu a melhor de " + numpartidas);
					} else if (numpartidas / 2 < vitoriascomp) {
						System.out.println("O computador venceu a melhor de " + numpartidas);
					}
				} else if (valorUsuario == 2 && valorsorteio == 3) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(papel)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");
					System.out.println();
					System.out.println("O computador ganhou!!!");
				} else if (valorUsuario == 2 && valorsorteio == 1) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(papel)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
					System.out.println();
					System.out.println("O usuário ganhou!!!");
				} else if (valorUsuario == 3 && valorsorteio == 1) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(tesoura)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
					System.out.println();
					System.out.println("O computador ganhou!!!");
				} else if (valorUsuario == 3 && valorsorteio == 2) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(tesoura)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(papel)");
					System.out.println();
					System.out.println("O usuário ganhou!!!");	
				} else if (valorUsuario == 1 && valorsorteio == 1) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(pedra)"); 
				    System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
				    System.out.println();
					System.out.println("Deu empate!!!");
				} else if (valorUsuario == 2 && valorsorteio == 2) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(pedra)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
					System.out.println();
					System.out.println("Deu empate!!!");
				} else if (valorUsuario == 3 && valorsorteio == 3) {
					System.out.println("O usuário selecionou: " + valorUsuario + "(tesoura)"); 
					System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");
					System.out.println();
					System.out.println("Deu empate!!!");
				}
				cont++;
				
				System.out.println( vitoriasusuario + "x" + vitoriascomp);
				
			}
			
			
					
		}
		
			
		
		
	
		
		
		

	}

}
