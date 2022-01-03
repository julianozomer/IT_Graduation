import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTamanho;
	private JTextField tfValor;
	private JTextField tfPosicao;
	private VetorDeReais meuVetorObj, outroVetorObj;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 414, 85);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("Tamanho do vetor de Reais");
		lblNewLabel.setBounds(10, 11, 153, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfTamanho = new JTextField();
		tfTamanho.setBounds(173, 8, 86, 20);
		frame.getContentPane().add(tfTamanho);
		tfTamanho.setColumns(10);
		
		JButton btnCriarVetor = new JButton("Criar vetor");
		btnCriarVetor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meuVetorObj = new VetorDeReais(Integer.parseInt(tfTamanho.getText()));
				
			}
		});
		btnCriarVetor.setBounds(284, 7, 89, 23);
		frame.getContentPane().add(btnCriarVetor);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setBounds(10, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfValor = new JTextField();
		tfValor.setText("");
		tfValor.setBounds(66, 50, 86, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Posi\u00E7\u00E3o");
		lblNewLabel_2.setBounds(173, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfPosicao = new JTextField();
		tfPosicao.setBounds(229, 50, 86, 20);
		frame.getContentPane().add(tfPosicao);
		tfPosicao.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meuVetorObj.setValor(Double.parseDouble(tfValor.getText()),
									Integer.parseInt(tfPosicao.getText()));
			}
		});
		btnOk.setBounds(335, 49, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnQtdPares = new JButton("Quantos pares?");
		btnQtdPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Quantidade de pares é " + meuVetorObj.quantosPares());
			}
		});
		btnQtdPares.setBounds(10, 97, 109, 23);
		frame.getContentPane().add(btnQtdPares);
		
		JButton btnGuardar = new JButton("GuardarVetor");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outroVetorObj = meuVetorObj;
				JOptionPane.showMessageDialog(frame, "Vetor atual foi guardado");
			}
		});
		btnGuardar.setBounds(302, 76, 122, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VetorDeReais resultadoDivisao = meuVetorObj.divide(outroVetorObj);
				textArea.setText("Divisão entre os objetos de VetorDeReais\n");
				textArea.append("\n Vetor A: "+ meuVetorObj.exibir());
				textArea.append("\n Vetor B: "+ outroVetorObj.exibir());
				textArea.append("\n Vetor Resultante: "+ resultadoDivisao.exibir());
				
			}
		});
		btnDividir.setBounds(10, 131, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = meuVetorObj.multiplica(outroVetorObj);
				textArea.setText("Multiplicação entre os objetos de VetorDeReais\n");
				textArea.append("\n Vetor A: "+ meuVetorObj.exibir());
				textArea.append("\n Vetor B: "+ outroVetorObj.exibir());
				textArea.append("\n Resultado: "+ resultado);
			}
		});
		btnMultiplicar.setBounds(107, 131, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnInverter = new JButton("Inverter");
		btnInverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Inversão do VetorDeReais\n");
				textArea.append("\n Vetor original: "+ meuVetorObj.exibir());
				meuVetorObj.inverte();
				textArea.append("\n Vetor após inversão: "+ meuVetorObj.exibir());
			}
		});
		btnInverter.setBounds(207, 131, 89, 23);
		frame.getContentPane().add(btnInverter);
		
		JButton btnMaiorDiferenca = new JButton("Diferen\u00E7a >");
		btnMaiorDiferenca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Maior diferença é " + meuVetorObj.maiorDiferencaConsecutivos());
				textArea.append("\n Vetor original: "+ meuVetorObj.exibir());
			}
		});
		btnMaiorDiferenca.setBounds(302, 131, 89, 23);
		frame.getContentPane().add(btnMaiorDiferenca);
		
		
		
		
		
		
	}
}
