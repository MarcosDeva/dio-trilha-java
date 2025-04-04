package desafio;

import javax.swing.JOptionPane;

public class ContaTerminal {

	public static void main(String[] args) {
		int opc, numero = 0;
		String agencia, nomeCliente = "";
		double saldo = 0;
		
		do {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog(null,""
							+ "1- Cadastro \n"
							+ "2- Sair"));
			switch(opc) {
			case 1 :
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero")); 
				agencia = JOptionPane.showInputDialog(null,"Agência"); 
				nomeCliente = JOptionPane.showInputDialog(null,"Nome"); 
				saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Saldo"));
				
				String mensagem = 
						"Olá"+ nomeCliente+", obrigado por criar uma conta em nosso banco, "
					  + "sua agência é ["+ agencia +"], conta ["+numero+"] e seu saldo ["+saldo+"] já está disponível";
				
				JOptionPane.showMessageDialog(null, mensagem );
				break;
			
			case 2 :
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			}
		} while(opc < 2);

	}

}
