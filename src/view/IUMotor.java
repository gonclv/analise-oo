package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import model.EstMotor;
import model.ImplMotor;

import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class IUMotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUMotor frame = new IUMotor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IUMotor() {
		ImplMotor simples = new ImplMotor();
		EstMotor estendido = new EstMotor();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMotorEstendido = new JPanel();
		panelMotorEstendido.setBorder(new TitledBorder(null, "Motor Estendido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelMotorEstendido.setBounds(32, 112, 362, 141);
		contentPane.add(panelMotorEstendido);
		panelMotorEstendido.setLayout(null);
		
		JTextArea txtStatusEstendido = new JTextArea();
		txtStatusEstendido.setText("Status: Desligado");
		txtStatusEstendido.setEditable(false);
		txtStatusEstendido.setBounds(27, 17, 185, 114);
		panelMotorEstendido.add(txtStatusEstendido);
		
		JButton btnDiminuirVelocidade = new JButton("Velocidade -");
		btnDiminuirVelocidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estendido.verificarStatus() == false) {
					JOptionPane.showMessageDialog(null, "O motor está desligado.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(estendido.verificarVelocidade() - 500 < 0) {
					JOptionPane.showMessageDialog(null, "Velocidade ultrapassou o limite de velocidade mínima do motor.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				estendido.diminuirVelocidade();
				String newString = "Status: Ligado \nVelocidade: " + estendido.verificarVelocidade() + " RPM";
				txtStatusEstendido.setText(newString);
			}
		});
		btnDiminuirVelocidade.setBounds(222, 110, 111, 21);
		panelMotorEstendido.add(btnDiminuirVelocidade);
		
		JButton btnAumentarVelocidade = new JButton("Velocidade +");
		btnAumentarVelocidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(estendido.verificarStatus() == false) {
					JOptionPane.showMessageDialog(null, "O motor está desligado.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(estendido.verificarVelocidade() + 500 > 7000) {
					JOptionPane.showMessageDialog(null, "Velocidade ultrapassou o limite de velocidade máxima do motor.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				estendido.aumentarVelocidade();
				String newString = "Status: Ligado \nVelocidade: " + estendido.verificarVelocidade() + " RPM";
				txtStatusEstendido.setText(newString);
			}
		});
		btnAumentarVelocidade.setBounds(222, 79, 111, 21);
		panelMotorEstendido.add(btnAumentarVelocidade);
		
		JButton btnLigarEstendido = new JButton("Ligar");
		btnLigarEstendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estendido.ligar();
				String newString = "Status: Ligado \nVelocidade: " + estendido.verificarVelocidade() + " RPM";
				txtStatusEstendido.setText(newString);
			}
		});
		btnLigarEstendido.setBounds(222, 17, 111, 21);
		panelMotorEstendido.add(btnLigarEstendido);
		
		JButton btnDesligarEstendido = new JButton("Desligar");
		btnDesligarEstendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estendido.desligar();
				String newString = "Status: Desligado ";
				txtStatusEstendido.setText(newString);
			}
		});
		btnDesligarEstendido.setBounds(222, 48, 111, 21);
		panelMotorEstendido.add(btnDesligarEstendido);
		
		JPanel panelMotor = new JPanel();
		panelMotor.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Motor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMotor.setBounds(32, 10, 362, 92);
		contentPane.add(panelMotor);
		panelMotor.setLayout(null);
		
		JTextArea txtStatusMotor = new JTextArea();
		txtStatusMotor.setEditable(false);
		txtStatusMotor.setText("Status: Desligado");
		txtStatusMotor.setBounds(27, 21, 186, 63);
		panelMotor.add(txtStatusMotor);
		
		JButton btnLigarMotor = new JButton("Ligar");
		btnLigarMotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simples.ligar();
				String newString = "Status: Ligado \nVelocidade: " + simples.verificarVelocidade() + " RPM";
				txtStatusMotor.setText(newString);
			}
		});
		btnLigarMotor.setBounds(223, 23, 111, 21);
		panelMotor.add(btnLigarMotor);
		
		JButton btnDesligarMotor = new JButton("Desligar");
		btnDesligarMotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simples.desligar();
				String newString = "Status: Desligado ";
				txtStatusMotor.setText(newString);
			}
		});
		btnDesligarMotor.setBounds(223, 54, 111, 21);
		panelMotor.add(btnDesligarMotor);
	}
}
