import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRendaAnual;
	private JTextField tfValorConsulta;
	private Contribuinte[] contribuintes = new Contribuinte[100];
	private int indice;

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
		
		tfNome = new JTextField();
		tfNome.setBounds(146, 11, 181, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(146, 42, 181, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 14, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setBounds(10, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual: R$");
		lblNewLabel_3.setBounds(10, 107, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfUF = new JTextField();
		tfUF.setBounds(146, 73, 88, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		tfRendaAnual = new JTextField();
		tfRendaAnual.setBounds(146, 104, 181, 20);
		frame.getContentPane().add(tfRendaAnual);
		tfRendaAnual.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfUF.getText());
				c.setRendaAnual(Double.parseDouble(tfRendaAnual.getText()));
				double imposto = c.calcularImposto();
				contribuintes[indice] = c;
				indice++;
				JOptionPane.showMessageDialog(null, "Contribuinte cadastrado pagará R$ " +imposto);
				
			}
		});
		btnCalcular.setBounds(335, 103, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblNewLabel_4 = new JLabel("Consulta valor imposto: R$");
		lblNewLabel_4.setBounds(10, 163, 140, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfValorConsulta = new JTextField();
		tfValorConsulta.setBounds(160, 160, 113, 20);
		frame.getContentPane().add(tfValorConsulta);
		tfValorConsulta.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(tfValorConsulta.getText());
				for (int i = 0; i < indice; i++) {
					if (contribuintes[i].calcularImposto() >= valor) {
						String str = "Contribuinte " + contribuintes[i].getNome() + "\n CPF: " + contribuintes[i].getCpf()
													 + "\n Estado: " + contribuintes[i].getUf()
													 + "\n Renda Anual: " + contribuintes[i].getRendaAnual()
													 + "\n Imposto: " + contribuintes[i].calcularImposto();
						JOptionPane.showMessageDialog(null, str);
					}
				}
			}
		});
		btnConsultar.setBounds(295, 159, 89, 23);
		frame.getContentPane().add(btnConsultar);
	}
}
