import java.util.Scanner;

public class Contador {
	
	static int parametroUm = 0;
	static int parametroDois = 0;
	
	public static void main(String[] args) {
		
		try {
			Scanner terminal = new Scanner(System.in);
			
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();
			
			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();
	
			 contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ){
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois ) {
			System.out.println("e maior parametroUm");
			
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
		}
		
		
	}
}