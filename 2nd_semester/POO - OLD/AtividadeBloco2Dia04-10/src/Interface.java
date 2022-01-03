// Juliano Zomer Filho

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JTextField tNomeUsuario;
	private JTextField tEndereco;
	private JTextField tDataInsta;
	private JTextField tRamoAtividade;
	private JTextField tQtdOcorrencia;
	private JTextField tTelConsulta;
	private JTextField tTelefone;
	private Telefonia[] telefones = new Telefonia[100];
	private int indice;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha o tipo de linha");
		lblNewLabel.setBounds(10, 11, 114, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Residencial", "Comercial", "Especializada"}));
		comboBox.setBounds(134, 7, 149, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nome usu\u00E1rio:");
		lblNewLabel_1.setBounds(10, 57, 91, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tNomeUsuario = new JTextField();
		tNomeUsuario.setBounds(134, 54, 149, 20);
		frame.getContentPane().add(tNomeUsuario);
		tNomeUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o instala\u00E7\u00E3o:");
		lblNewLabel_2.setBounds(10, 110, 114, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tEndereco = new JTextField();
		tEndereco.setBounds(134, 107, 418, 20);
		frame.getContentPane().add(tEndereco);
		tEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data instala\u00E7\u00E3o:");
		lblNewLabel_3.setBounds(10, 172, 91, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tDataInsta = new JTextField();
		tDataInsta.setBounds(134, 169, 131, 20);
		frame.getContentPane().add(tDataInsta);
		tDataInsta.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Conex\u00E3o Internet:");
		lblNewLabel_4.setBounds(361, 11, 96, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBoxInternet = new JComboBox();
		comboBoxInternet.setModel(new DefaultComboBoxModel(new String[] {"Sim", "N\u00E3o"}));
		comboBoxInternet.setBounds(482, 7, 70, 22);
		frame.getContentPane().add(comboBoxInternet);
		
		JLabel lblNewLabel_5 = new JLabel("Ramo de Atividade:");
		lblNewLabel_5.setBounds(361, 57, 96, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tRamoAtividade = new JTextField();
		tRamoAtividade.setBounds(482, 54, 114, 20);
		frame.getContentPane().add(tRamoAtividade);
		tRamoAtividade.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Qtde ocorr\u00EAncias:");
		lblNewLabel_6.setBounds(299, 172, 96, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		tQtdOcorrencia = new JTextField();
		tQtdOcorrencia.setBounds(405, 169, 86, 20);
		frame.getContentPane().add(tQtdOcorrencia);
		tQtdOcorrencia.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_7.setBounds(10, 241, 719, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Consultas");
		lblNewLabel_8.setBounds(299, 254, 55, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Telefone que deseja consultar:");
		lblNewLabel_9.setBounds(10, 282, 157, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		tTelConsulta = new JTextField();
		tTelConsulta.setBounds(177, 279, 149, 20);
		frame.getContentPane().add(tTelConsulta);
		tTelConsulta.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Potencial Faturamento");
		lblNewLabel_10.setBounds(10, 336, 149, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("N\u00FAmero desejado:");
		lblNewLabel_11.setBounds(10, 215, 91, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		tTelefone = new JTextField();
		tTelefone.setBounds(134, 212, 131, 20);
		frame.getContentPane().add(tTelefone);
		tTelefone.setColumns(10);
		
		JButton btnCriarLinha = new JButton("Criar Linha");
		btnCriarLinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telefonia t = new Telefonia();
				t.setNome(tNomeUsuario.getText());
				t.setTipoLinha(comboBox.getSelectedItem().toString());
				t.setInternet(comboBoxInternet.getSelectedItem().toString());
				t.setAtividade(tRamoAtividade.getText());
				t.setEndereco(tEndereco.getText());
				LocalDate data = LocalDate.parse(tDataInsta.getText(),formatador);
				t.setDataInstalacao(data);
				t.setTelefone(tTelefone.getText());
				t.setQtdOcorrencias(Integer.parseInt(tQtdOcorrencia.getText()));
				telefones[indice] = t;
				indice++;
				JOptionPane.showMessageDialog(null, "Linha criada com sucesso");
				
				
				
				
			}
		});
		btnCriarLinha.setBounds(309, 211, 122, 23);
		frame.getContentPane().add(btnCriarLinha);
		
		JButton btnConsultarNum = new JButton("Consultar");
		btnConsultarNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < indice; i++) {
					if (telefones[i].getTelefone().equals(tTelConsulta.getText())) {
						String str = "Usuário " + telefones[i].getNome() + "\n Endereço: " + telefones[i].getEndereco()
								 + "\n Linha: " + telefones[i].getTipoLinha()
								 + "\n Internet: " + telefones[i].getInternet()
								 + "\n Atividade: " + telefones[i].getAtividade()
								 + "\n Data Instalação: " + telefones[i].getDataInstalacao()
								 + "\n Telefone: " + telefones[i].getTelefone()
								 + "\n Quantidade de Ocorrências: " + telefones[i].getQtdOcorrencias()
								 + "\n Valor básico a pagar: " + telefones[i].custoFixo();
							JOptionPane.showMessageDialog(null, str);
					}
				}
			}
		});
		btnConsultarNum.setBounds(346, 278, 89, 23);
		frame.getContentPane().add(btnConsultarNum);
		
		
		JButton btnConsultarFat = new JButton("Consultar");
		btnConsultarFat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double faturamento = 0;
				for (int i = 0; i < indice; i++) {
					faturamento += telefones[i].custoFixo();
				}
				JOptionPane.showMessageDialog(null, "Potencial Faturamento de R$ "+ faturamento);
			}
		});
		btnConsultarFat.setBounds(177, 332, 89, 23);
		frame.getContentPane().add(btnConsultarFat);
	}
}
