package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Plataforma;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtJogo;
	private JTextField txtFabricante;
	private JTextField txtValor;
	private JTextField txtObservacoes;

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJogo = new JLabel("Jogo:");
		lblJogo.setBounds(10, 14, 46, 14);
		contentPane.add(lblJogo);
		
		txtJogo = new JTextField();
		txtJogo.setBounds(46, 11, 167, 20);
		contentPane.add(txtJogo);
		txtJogo.setColumns(10);
		
		txtFabricante = new JTextField();
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(71, 39, 142, 20);
		contentPane.add(txtFabricante);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(10, 42, 80, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(10, 111, 46, 14);
		contentPane.add(lblConsole);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(88, 139, 125, 20);
		contentPane.add(txtValor);
		
		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setBounds(10, 142, 80, 14);
		contentPane.add(lblValorEstimado);
		
		JRadioButton rdbtnZerado = new JRadioButton("Zerado");
		rdbtnZerado.setBounds(10, 67, 59, 23);
		contentPane.add(rdbtnZerado);
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setModel(new DefaultComboBoxModel(Plataforma.values()));
		comboConsole.setBounds(60, 107, 153, 22);
		contentPane.add(comboConsole);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setColumns(10);
		txtObservacoes.setBounds(98, 170, 115, 75);
		contentPane.add(txtObservacoes);
		
		JLabel lblobservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblobservacoes.setBounds(10, 173, 80, 14);
		contentPane.add(lblobservacoes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 256, 203, 51);
		contentPane.add(btnSalvar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(397, 35, 177, 210);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblLista = new JLabel("Lista:");
		lblLista.setBounds(397, 14, 46, 14);
		contentPane.add(lblLista);
		
		JButton btnEsquerda = new JButton("<");
		btnEsquerda.setBounds(397, 266, 71, 41);
		contentPane.add(btnEsquerda);
		
		JButton btnDireita = new JButton(">");
		btnDireita.setBounds(503, 266, 71, 41);
		contentPane.add(btnDireita);
	}
}
