package aula1;
import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		
		// Declarando variav�is
		int idade=0, cont_idade = 10;
		
		// Estrutura de Repeti��o
		while(idade <= cont_idade)
		{
			System.out.println("Idade contabilizada");
			idade++;
		}
							
		
		// Declarando variav�is
		int i;
		
		// Estrutura de Repeti��o
		for (i=0; i<10; i++) {
			System.out.println("Digite a primeira nota");
		}
			

		// Declarando variav�is
		int nota_2=10, nota_1=10, valor;
		
		valor = nota_2 + nota_1;
		
		// Estrutura de decis�o
		if(valor <= 20) {
			System.out.print("Valor abaixo de 20");
		}
		else {
			System.out.print("Valor acima de 20");
		}
		
		
		// Declarando variav�is
		
			Scanner opcao_scanner = new Scanner (System.in);
				
			System.out.println("Menu");
			System.out.println("[1] Aventura");
			System.out.println("[2] A��o");
			System.out.println("[3] Com�dia");
			int opcao = opcao_scanner.nextInt();
				
			//estrutura de decis�o
			switch(opcao){
				case 1: 
					System.out.println("Voc� escolheu a op��o Aventura");
					break;
						
				case 2:
					System.out.println("Voc� escolheu a op��o A��o");
					break;
						
				case 3:
					System.out.println("Voc� escolheu a op��o Com�dia");
					break;
			}
				
	}
}