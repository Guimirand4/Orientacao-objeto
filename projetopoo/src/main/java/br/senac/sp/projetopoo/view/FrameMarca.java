package br.senac.sp.projetopoo.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senac.sp.projetopoo.dao.ConnectionFactory;
import br.senac.sp.projetopoo.modelo.Marca;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameMarca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfNome;
	private JLabel lbLogo;
	private Marca marca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMarca frame = new FrameMarca();
					frame.setVisible(true);
					ConnectionFactory.getConexao();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMarca() {
		setTitle("Cadasto de Marcas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 90, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 41, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfId = new JTextField();
		tfId.setEditable(false);
		tfId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfId.setBounds(44, 38, 57, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setColumns(10);
		tfNome.setBounds(65, 87, 153, 20);
		contentPane.add(tfNome);
		
		JLabel lbLogo = new JLabel("");
		lbLogo.setBackground(new Color(67, 137, 188));
		lbLogo.setForeground(new Color(0, 64, 64));
		lbLogo.setBounds(340, 13, 57, 49);
		contentPane.add(lbLogo);
		lbLogo.setOpaque(true);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(67, 137, 188));
		btnExcluir.setMnemonic('e');
		btnExcluir.setBounds(157, 174, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfNome.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(FrameMarca.this, "Informe o nome", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					tfNome.requestFocus();
				}else {
					marca = new Marca();
					marca.setNome(tfNome.getText().trim());
				}
			}
		});
		btnSalvar.setBackground(new Color(67, 137, 188));
		btnSalvar.setMnemonic('s');
		btnSalvar.setBounds(20, 174, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(67, 137, 188));
		btnLimpar.setMnemonic('l');
		btnLimpar.setBounds(291, 174, 89, 23);
		contentPane.add(btnLimpar);
	}
}
