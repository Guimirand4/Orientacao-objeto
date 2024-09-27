package heranca;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MinhaJanela extends JFrame{
	public MinhaJanela() {
		JButton Salvar = new JButton("Salvar");
		Salvar.setBounds(0,180,150,30);
		getContentPane().setLayout(null);
		getContentPane().add(Salvar);
		JButton limpar = new JButton("Excluir");
		limpar.setBounds(170,180,150,30);
		getContentPane().setLayout(null);
		getContentPane().add(limpar);
		JButton botao = new JButton("Limpar");
		botao.setBounds(350,180,150,30);
		getContentPane().setLayout(null);
		getContentPane().add(botao);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
	}
}
