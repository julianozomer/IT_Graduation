import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Apresentacao {

	private JFrame frame;
	private JTextField tFrase;

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
		
		JLabel lblNewLabel = new JLabel("Insira a frase");
		lblNewLabel.setBounds(10, 11, 87, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(24, 68, 389, 182);
		frame.getContentPane().add(textArea);
		
		tFrase = new JTextField();
		tFrase.setBounds(86, 16, 177, 20);
		frame.getContentPane().add(tFrase);
		tFrase.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frase f = new Frase(tFrase.getText());
				String[] array = f.dividirFrase();
				textArea.setText("Frase: " + f.getTexto());
				for (int i = 0; i < array.length; i++) {
					String palavra = array[i];
					textArea.append("\n" + palavra + " - " + palavra.length());
				}
			}
		});
		btnMostrar.setBounds(293, 15, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		
	}
}
