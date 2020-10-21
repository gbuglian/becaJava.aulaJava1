package aula1;
import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		
		// Declarando variavéis
		int idade=0, cont_idade = 10;
		
		// Estrutura de Repetição
		while(idade <= cont_idade)
		{
			System.out.println("Idade contabilizada");
			idade++;
		}
							
		
		// Declarando variavéis
		int i;
		
		// Estrutura de Repetição
		for (i=0; i<10; i++) {
			System.out.println("Digite a primeira nota");
		}
			

		// Declarando variavéis
		int nota_2=10, nota_1=10, valor;
		
		valor = nota_2 + nota_1;
		
		// Estrutura de decisão
		if(valor <= 20) {
			System.out.print("Valor abaixo de 20");
		}
		else {
			System.out.print("Valor acima de 20");
		}
		
		
		// Declarando variavéis
		
			Scanner opcao_scanner = new Scanner (System.in);
				
			System.out.println("Menu");
			System.out.println("[1] Aventura");
			System.out.println("[2] Ação");
			System.out.println("[3] Comédia");
			int opcao = opcao_scanner.nextInt();
				
			//estrutura de decisão
			switch(opcao){
				case 1: 
					System.out.println("Você escolheu a opção Aventura");
					break;
						
				case 2:
					System.out.println("Você escolheu a opção Ação");
					break;
						
				case 3:
					System.out.println("Você escolheu a opção Comédia");
					break;
			}
				
	}
}