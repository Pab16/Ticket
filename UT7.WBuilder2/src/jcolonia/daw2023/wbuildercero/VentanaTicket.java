package jcolonia.daw2023.wbuildercero;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextPane;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class VentanaTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicket frame = new VentanaTicket();
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
	public VentanaTicket() {
		setTitle("UT7: Ejemplo eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel jpanelExterior = new JPanel();
		jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(jpanelExterior, BorderLayout.CENTER);
		jpanelExterior.setLayout(new BorderLayout(0, 10));
		
		JPanel jpanelBotones = new JPanel();
		jpanelExterior.add(jpanelBotones, BorderLayout.SOUTH);
		jpanelBotones.setLayout(new GridLayout(1, 0, 10, 0));
		
		JButton jbotónAceptar = new JButton("Aceptar");
		jbotónAceptar.setMnemonic(KeyEvent.VK_A);
		jbotónAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jpanelBotones.add(jbotónAceptar);
		
		JButton jbotónCancelar = new JButton("Cancelar");
		jbotónCancelar.setMnemonic(KeyEvent.VK_C);
		jpanelBotones.add(jbotónCancelar);
		
		JPanel jpanelBorde = new JPanel();
		jpanelBorde.setBorder(new TitledBorder(null, "UT7 Eventos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpanelExterior.add(jpanelBorde, BorderLayout.CENTER);
		jpanelBorde.setLayout(new BorderLayout(0, 0));
		
		JPanel jpanelPrincipal = new JPanel();
		jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
		jpanelBorde.add(jpanelPrincipal, BorderLayout.CENTER);
		jpanelPrincipal.setLayout(new BorderLayout(0, 10));
		
		JButton jbotónAvanzar = new JButton("+");
		jbotónAvanzar.setMnemonic(KeyEvent.VK_ADD);
		jpanelPrincipal.add(jbotónAvanzar, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		jpanelPrincipal.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea jtexto = new JTextArea();
		scrollPane.setViewportView(jtexto);
	}

}
