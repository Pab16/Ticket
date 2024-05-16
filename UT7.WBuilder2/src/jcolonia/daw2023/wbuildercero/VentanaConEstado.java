package jcolonia.daw2023.wbuildercero;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VentanaConEstado {

	private JFrame marcoPrincipal;
	private JMenuBar barraDeMenu;
	private JMenu menuAyuda;
	private JMenuItem opcionMenuHola;
	private JPanel jpanelExterior;
	private JPanel jpanelBotones;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConEstado window = new VentanaConEstado();
					window.marcoPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaConEstado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		marcoPrincipal = new JFrame();
		marcoPrincipal.setBounds(100, 100, 450, 300);
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoPrincipal.setJMenuBar(getBarraDeMenu());
		marcoPrincipal.getContentPane().add(getJpanelExterior(), BorderLayout.CENTER);
	}

	private JMenuBar getBarraDeMenu() {
		if (barraDeMenu == null) {
			barraDeMenu = new JMenuBar();
			barraDeMenu.add(getMenuAyuda());
		}
		return barraDeMenu;
	}
	private JMenu getMenuAyuda() {
		if (menuAyuda == null) {
			menuAyuda = new JMenu("Ayuda");
			menuAyuda.add(getOpcionMenuHola());
		}
		return menuAyuda;
	}
	private JMenuItem getOpcionMenuHola() {
		if (opcionMenuHola == null) {
			opcionMenuHola = new JMenuItem("Bienvenida");
			opcionMenuHola.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return opcionMenuHola;
	}
	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			GroupLayout gl_jpanelBotones = new GroupLayout(jpanelBotones);
			gl_jpanelBotones.setHorizontalGroup(
				gl_jpanelBotones.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_jpanelBotones.createSequentialGroup()
						.addContainerGap(240, Short.MAX_VALUE)
						.addComponent(getBtnNewButton_1())
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(getBtnNewButton()))
			);
			gl_jpanelBotones.setVerticalGroup(
				gl_jpanelBotones.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_jpanelBotones.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(gl_jpanelBotones.createParallelGroup(Alignment.BASELINE)
							.addComponent(getBtnNewButton())
							.addComponent(getBtnNewButton_1()))
						.addContainerGap())
			);
			jpanelBotones.setLayout(gl_jpanelBotones);
		}
		return jpanelBotones;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Botón 1");
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Botón 2");
		}
		return btnNewButton_1;
	}
}
