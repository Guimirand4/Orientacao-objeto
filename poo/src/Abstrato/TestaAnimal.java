package Abstrato;

import javax.swing.JOptionPane;

public class TestaAnimal {
	public static void main(String[] args) {
		Cachorro rex = new Cachorro();
		System.out.println(rex);
		JOptionPane.showInputDialog(null, "Escolha um tipo", null, 0, null, TiposAnimal.values(), null);
	}
}
