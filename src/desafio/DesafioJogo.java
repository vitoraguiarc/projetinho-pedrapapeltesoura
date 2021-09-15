package desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		
		int valorsorteio = sorteio.nextInt(3) + 1;
		int valorUsuario, numpartidas;
		int cont = 0;
		int vitoriasusuario = 0;
		int vitoriascomp = 0;
		int empate = 0;
		
		String jogarnovamente = "S";
		
		System.out.println("----------------------------");
		System.out.println("      J O K E N P O         ");
		System.out.println("----------------------------");
		
		System.out.print("Quantas partidas: ");
		
		numpartidas = leitor.nextInt();
		
		while (numpartidas % 2 == 0 || numpartidas < 3) {
			System.out.println();
			System.out.println("Número de partidas inserido inválido");
			System.out.println();
			System.out.print("Digite novamente quantas partidas: ");
			numpartidas = leitor.nextInt();}
			
			while (cont < numpartidas && jogarnovamente.equals("S") ) {
				
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println();
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println();
				System.out.print("Digite sua escolha(use apenas os algorismos 1, 2 ou 3: ");
				valorUsuario = leitor.nextInt();
				
				while ( valorUsuario < 1 || valorUsuario > 3) {
					System.out.println();
					System.out.println("Valor inserido ínvalido");
					System.out.println();
					System.out.print("Digite sua escolha novamente: ");
					valorUsuario = leitor.nextInt();
				}
					
				
				System.out.println();
				System.out.println("Partida " + (cont + 1));
				System.out.println();
				
				
				if (valorUsuario == 1) {
					System.out.println("Você selecionou pedra");
				} else if (valorUsuario == 2) {
					System.out.println("Você selecionou papel");
				} else {
					System.out.println("Você selecionou tesoura");
				}
				
				if (valorsorteio == 1) {
					System.out.println("O computador selecionou pedra");
				} else if (valorsorteio == 2) {
					System.out.println("O computador selecionou papel");
				} else {
					System.out.println("O computador selecionou tesoura");
				}
				
				 if((valorUsuario == 1 && valorsorteio == 3) || (valorUsuario == 2 && valorsorteio == 1) || (valorUsuario == 3 && valorsorteio == 2)) {
	    			 System.out.println("Você ganhou essa rodada");
	    			  vitoriasusuario++;
	    		 }else if((valorsorteio == 1 && valorUsuario == 3) ||  (valorsorteio == 2 && valorUsuario == 1) || (valorsorteio == 3 && valorUsuario == 2)) {
	    		     System.out.println("Você perdeu essa rodada");
	    	 	     vitoriascomp++;	 
	    	     }else{
	    	    	 System.out.println("Empatou");
	    	    	 empate++;
				 
				if ( vitoriascomp >= numpartidas/ 2 + 1 || vitoriasusuario >= numpartidas/ 2 + 1) {
					cont = numpartidas;
				}
				
				cont++;
				
				
				System.out.println( vitoriasusuario + "x" + vitoriascomp);
				if (numpartidas / 2 < vitoriasusuario ) {
					System.out.println("O usuario venceu a melhor de " + numpartidas);
				}   
				    else if (numpartidas / 2 < vitoriascomp) {
					System.out.println("O computador venceu a melhor de " + numpartidas);
				}  
				
			}
			
			}
			
			
			
	}			
		
}	
			
		
		
	
		
		


	


