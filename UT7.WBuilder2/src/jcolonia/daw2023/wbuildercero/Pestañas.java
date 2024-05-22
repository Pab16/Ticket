package jcolonia.daw2023.wbuildercero;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pestañas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelPescaderia;
	private JPanel panelCarniceria;
	private JPanel panelFruteria;
	private JPanel panelExterior;
	private JPanel panel;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu menuAyuda;
	private JMenuItem mntmNewMenuItem;
	private JPanel panel_2;
	private JPanel panel_1;
	private JButton pasarTurno;
	private JButton sacarTicket;
	private JPanel panel_3;
	private JLabel lblTicketsSacados;
	private Ticket ticket;
	private JTextField textoEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket ticket;
					ticket = new Ticket("Tickets");
					
					Pestañas frame = new Pestañas(ticket);
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
	public Pestañas(Ticket ticket) {
		this.ticket = ticket;
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
		contentPane.add(getTextoEstado(), BorderLayout.SOUTH);
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("Pescadería", null, getPanelPescaderia(), null);
			tabbedPane.addTab("Carnicería", null, getPanelCarniceria(), null);
			tabbedPane.addTab("Frutería", null, getPanelFruteria(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanelPescaderia() {
		if (panelPescaderia == null) {
			panelPescaderia = new JPanel();
			panelPescaderia.setToolTipText("");
			panelPescaderia.setLayout(new BorderLayout(10, 10));
			panelPescaderia.add(getPanelExterior(), BorderLayout.CENTER);
		}
		return panelPescaderia;
	}
	private JPanel getPanelCarniceria() {
		if (panelCarniceria == null) {
			panelCarniceria = new JPanel();
		}
		return panelCarniceria;
	}
	private JPanel getPanelFruteria() {
		if (panelFruteria == null) {
			panelFruteria = new JPanel();
		}
		return panelFruteria;
	}
	private JPanel getPanelExterior() {
		if (panelExterior == null) {
			panelExterior = new JPanel();
			panelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			panelExterior.setLayout(new BorderLayout(0, 0));
			panelExterior.add(getPanel(), BorderLayout.CENTER);
			panelExterior.add(getPanel_2(), BorderLayout.SOUTH);
		}
		return panelExterior;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Pescader\u00EDa abc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField(), BorderLayout.CENTER);
		}
		return panel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 50));
			textField.setText("0");
			textField.setDisabledTextColor(new Color(0, 0, 0));
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setColumns(2);
		}
		return textField;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMenuAyuda());
		}
		return menuBar;
	}
	private JMenu getMenuAyuda() {
		if (menuAyuda == null) {
			menuAyuda = new JMenu("Ayuda");
			menuAyuda.add(getMntmNewMenuItem());
		}
		return menuAyuda;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("New menu item");
		}
		return mntmNewMenuItem;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new BorderLayout(0, 10));
			panel_2.add(getPanel_1_1(), BorderLayout.CENTER);
			panel_2.add(getPanel_3(), BorderLayout.NORTH);
		}
		return panel_2;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(0, 2, 20, 0));
			panel_1.add(getPasarTurno());
			panel_1.add(getSacarTicket());
		}
		return panel_1;
	}
	private JButton getPasarTurno() {
		if (pasarTurno == null) {
			pasarTurno = new JButton("Pasar Turno");
			pasarTurno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ticket.avanzarTurno();
						String texto = String.format("%d", ticket.getTurno());
						getTextField().setText(texto);
						
					} catch (TicketException ex) {
						avisoPopUp(ex.getMessage());
					}
				}
			});
		}
		return pasarTurno;
	}
	private JButton getSacarTicket() {
		if (sacarTicket == null) {
			sacarTicket = new JButton("Sacar Ticket");
			sacarTicket.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ticket.tirarTicket();
						String texto = String.format("Tickets sacados: %d", ticket.getTicket());
						avisoEstado("Ticket sacado!");
						getLblTicketsSacados().setText(texto);
					} catch (TicketException ex) {
						avisoPopUp(ex.getMessage());
					}
				}
			});
		}
		return sacarTicket;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(1, 0, 10, 0));
			panel_3.add(getLblTicketsSacados());
		}
		return panel_3;
	}
	private JLabel getLblTicketsSacados() {
		if (lblTicketsSacados == null) {
			String texto = String.format("Tickets sacados: %d", ticket.getTicket());
			lblTicketsSacados = new JLabel(texto);
			lblTicketsSacados.setHorizontalAlignment(SwingConstants.TRAILING);
		}
		return lblTicketsSacados;
	}
	private JTextField getTextoEstado() {
		if (textoEstado == null) {
			textoEstado = new JTextField();
			textoEstado.setDisabledTextColor(new Color(0, 0, 0));
			textoEstado.setHorizontalAlignment(SwingConstants.CENTER);
			textoEstado.setEnabled(false);
			textoEstado.setEditable(false);
			textoEstado.setColumns(10);
		}
		return textoEstado;
	}
	
	public void avisoEstado(String texto) {
		getTextoEstado().setDisabledTextColor(new Color(0,0,0));
		getTextoEstado().setText(texto);
	}
	
	public void avisoPopUp(String texto) {
		JOptionPane.showMessageDialog(getPanelExterior(), texto, "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
	}
}
