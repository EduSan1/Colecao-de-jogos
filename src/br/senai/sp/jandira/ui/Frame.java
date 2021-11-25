package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.PlainDocument;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.model.Numeros;
import br.senai.sp.jandira.model.Plataforma;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogosRepository;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtJogo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	
	private int posicao;
	private JTextField txtNumero;

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

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(10, 42, 80, 14);
		contentPane.add(lblFabricante);

		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(10, 111, 46, 14);
		contentPane.add(lblConsole);

		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setDocument(new Numeros());
		txtValor.setBounds(88, 139, 125, 20);
		contentPane.add(txtValor);

		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setBounds(10, 142, 80, 14);
		contentPane.add(lblValorEstimado);

		JRadioButton rdbtnZerado = new JRadioButton("Zerado");
		rdbtnZerado.setBounds(10, 67, 59, 23);
		contentPane.add(rdbtnZerado);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(328, 11, 25, 20);
		
		JComboBox comboPlataforma = new JComboBox();
		DefaultComboBoxModel<String> modelPlataforma = new DefaultComboBoxModel<String>();

		for (Plataforma plataforma : Plataforma.values()) {

			modelPlataforma.addElement(plataforma.getDescricao());

		}
		comboPlataforma.setModel(modelPlataforma);
		comboPlataforma.setBounds(60, 107, 153, 22);
		contentPane.add(comboPlataforma);

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

		JList listJogos = new JList();
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listJogos.setModel(listModel);
		scrollPane.setViewportView(listJogos);

		JLabel lblLista = new JLabel("Lista:");
		lblLista.setBounds(397, 14, 46, 14);
		contentPane.add(lblLista);

		JButton btnCima = new JButton("<");
		btnCima.setBounds(397, 266, 71, 41);
		contentPane.add(btnCima);

		JButton btnBaixo = new JButton(">");
		btnBaixo.setBounds(503, 266, 71, 41);
		contentPane.add(btnBaixo);
		
		JComboBox comboFabricante = new JComboBox();
		comboFabricante.setBounds(72, 42, 141, 22);
		DefaultComboBoxModel<String> modelFabricante = new DefaultComboBoxModel<String>();
		
		FabricanteRepository repositorioFabricante = new FabricanteRepository();

		for (Fabricante fabricante : repositorioFabricante.getFabricante()) {

			modelFabricante.addElement(fabricante.getNome());

		}
		comboFabricante.setModel(modelFabricante);
		contentPane.add(comboFabricante);
		

		
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

		JogosRepository colecao = new JogosRepository();
		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo jogo = new Jogo();
				jogo.setTitulo(txtJogo.getText());
				jogo.setFrabricante(
						repositorioFabricante.getFabricante(
								comboFabricante.getSelectedIndex()));
				jogo.setZerado(rdbtnZerado.isSelected());
				jogo.setObservacoes(txtObservacoes.getText());
				jogo.setValor(txtValor.getText());
				jogo.setPlataforma(plataformaSelecionada(comboPlataforma.getSelectedIndex()));

//				posicao = Integer.parseInt(txtNumero.getText()) -1;
				
				System.out.println(jogo.getFrabricante());
				System.out.println(jogo.getObservacoes());
				System.out.println(jogo.getTitulo());
				System.out.println(jogo.getValor());
				System.out.println(jogo.getPlataforma());
				System.out.println(jogo.getFrabricante().getNome());
				
				colecao.gravar(jogo, posicao);
				listModel.addElement(jogo.getTitulo());
				posicao++;
				//list.setSelectedIndex(0);
				
				if (posicao == colecao.getTamanhoColecao()) {
					
					btnSalvar.setEnabled(false);
					JOptionPane.showMessageDialog(null, "A coelcao esta cheia!","Colecao cheia", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		
		btnCima.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if (listJogos.getSelectedIndex() <0) {
					
				} else {
					listJogos.setSelectedIndex(listJogos.getSelectedIndex()-1);
					
				}
				
				
			}
		});
		
		btnBaixo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (listJogos.getSelectedIndex() <0) {
					
				} else {
					listJogos.setSelectedIndex(listJogos.getSelectedIndex()+1);
				}
				
			}
		});
		
		listJogos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int i = listJogos.getSelectedIndex();
				
				Jogo jogo = colecao.listarJogo(i);
				
				txtJogo.setText(jogo.getTitulo());
				txtObservacoes.setText(jogo.getObservacoes());
				txtValor.setText(String.valueOf(jogo.getValor()));
				comboFabricante.setSelectedIndex(repositorioFabricante.getIndex(jogo.getFrabricante()));
				comboPlataforma.setSelectedIndex(jogo.getPlataforma().ordinal());
				rdbtnZerado.setSelected(jogo.isZerado());
				
			}
		});

	}

	private Plataforma plataformaSelecionada(int plataformaSelecionado) {

		if (plataformaSelecionado == 0) {
			return Plataforma.PC;
		} else if (plataformaSelecionado == 1) {
			return Plataforma.XBOXONE;
		} else if (plataformaSelecionado == 2) {
			return Plataforma.XBOX360;
		} else if (plataformaSelecionado == 3) {
			return Plataforma.XBOXSERIESS;
		} else if (plataformaSelecionado == 4) {
			return Plataforma.XBOXSERIESX;
		} else if (plataformaSelecionado == 5) {
			return Plataforma.PLAYSTATION1;
		} else if (plataformaSelecionado == 6) {
			return Plataforma.PLAYSTATION2;
		} else if (plataformaSelecionado == 7) {
			return Plataforma.PLAYSTATION3;
		} else if (plataformaSelecionado == 8) {
			return Plataforma.PLAYSTATION4;
		} else if (plataformaSelecionado == 9) {
			return Plataforma.PLAYSTATION5;
		} else {
			return Plataforma.SWITCH;
		}
	}
}
