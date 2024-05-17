package jcolonia.daw2023.wbuildercero;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;

public class UT7Ticket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpanelExterior;
	private JPanel jpanelBorde;
	private JPanel jpanelPrincipal;
	private Ticket ticketPescadería;
	private JPanel jpanelInfo;
	private JPanel jpanelNombres;
	private JTextField txtTicket;
	private JTextField txtTickets;
	private JTextField jtextoTurno;
	private JTextField jtextoTicket;
	private JPanel jpanelAccion;
	private JButton btnAvanzar;
	private JButton btnTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket ticketPescadería;
					ticketPescadería = new Ticket("Pescadería");
					
					UT7Ticket frame = new UT7Ticket(ticketPescadería);
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
	public UT7Ticket(Ticket ticketPescadería) {
		this.ticketPescadería = ticketPescadería;
		ticketPescadería.restablecer();
		setTitle("UT7: Ejemplo eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJpanelExterior(), BorderLayout.CENTER);
	}
	
	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 10));
			jpanelExterior.add(getJpanelBorde(), BorderLayout.CENTER);
		}
		return jpanelExterior;
	}
	private JPanel getJpanelBorde() {
		if (jpanelBorde == null) {
			jpanelBorde = new JPanel();
			jpanelBorde.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), ticketPescadería.getTítulo(), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBorde.setLayout(new BorderLayout(0, 0));
			jpanelBorde.add(getJpanelPrincipal(), BorderLayout.CENTER);
		}
		return jpanelBorde;
	}
	private JPanel getJpanelPrincipal() {
		if (jpanelPrincipal == null) {
			jpanelPrincipal = new JPanel();
			jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelPrincipal.setLayout(new BorderLayout(0, 10));
			jpanelPrincipal.add(getJpanelInfo(), BorderLayout.CENTER);
			jpanelPrincipal.add(getJpanelNombres(), BorderLayout.NORTH);
			jpanelPrincipal.add(getPanel_2(), BorderLayout.SOUTH);
		}
		return jpanelPrincipal;
	}
	private JPanel getJpanelInfo() {
		if (jpanelInfo == null) {
			jpanelInfo = new JPanel();
			jpanelInfo.setLayout(new GridLayout(1, 2, 10, 0));
			jpanelInfo.add(getJtextoTurno());
			jpanelInfo.add(getJtextoTicket());
		}
		return jpanelInfo;
	}
	private JPanel getJpanelNombres() {
		if (jpanelNombres == null) {
			jpanelNombres = new JPanel();
			jpanelNombres.setLayout(new GridLayout(1, 0, 10, 0));
			jpanelNombres.add(getTxtTicket());
			jpanelNombres.add(getTxtTickets());
		}
		return jpanelNombres;
	}
	private JTextField getTxtTicket() {
		if (txtTicket == null) {
			txtTicket = new JTextField();
			txtTicket.setDisabledTextColor(new Color(0, 0, 0));
			txtTicket.setEnabled(false);
			txtTicket.setBorder(null);
			txtTicket.setEditable(false);
			txtTicket.setHorizontalAlignment(SwingConstants.CENTER);
			txtTicket.setText("TURNO");
			txtTicket.setColumns(10);
		}
		return txtTicket;
	}
	private JTextField getTxtTickets() {
		if (txtTickets == null) {
			txtTickets = new JTextField();
			txtTickets.setEnabled(false);
			txtTickets.setEditable(false);
			txtTickets.setDisabledTextColor(new Color(0, 0, 0));
			txtTickets.setBorder(null);
			txtTickets.setHorizontalAlignment(SwingConstants.CENTER);
			txtTickets.setText("TICKETS");
			txtTickets.setColumns(10);
		}
		return txtTickets;
	}
	private JTextField getJtextoTurno() {
		if (jtextoTurno == null) {
			jtextoTurno = new JTextField();
			jtextoTurno.setDisabledTextColor(new Color(0, 0, 0));
			jtextoTurno.setEnabled(false);
			jtextoTurno.setEditable(false);
			jtextoTurno.setFont(new Font("Noto Sans", Font.BOLD, 45));
			jtextoTurno.setHorizontalAlignment(SwingConstants.CENTER);
			jtextoTurno.setText("0");
			jtextoTurno.setColumns(10);
		}
		return jtextoTurno;
	}
	private JTextField getJtextoTicket() {
		if (jtextoTicket == null) {
			jtextoTicket = new JTextField();
			jtextoTicket.setEditable(false);
			jtextoTicket.setEnabled(false);
			jtextoTicket.setDisabledTextColor(new Color(0, 0, 0));
			jtextoTicket.setText("0");
			jtextoTicket.setHorizontalAlignment(SwingConstants.CENTER);
			jtextoTicket.setFont(new Font("Noto Sans", Font.BOLD, 45));
			jtextoTicket.setColumns(10);
		}
		return jtextoTicket;
	}
	private JPanel getPanel_2() {
		if (jpanelAccion == null) {
			jpanelAccion = new JPanel();
			jpanelAccion.setLayout(new GridLayout(1, 1, 10, 0));
			jpanelAccion.add(getJbotónAvanzar_1());
			jpanelAccion.add(getBtnTicket());
		}
		return jpanelAccion;
	}
	private JButton getJbotónAvanzar_1() {
		if (btnAvanzar == null) {
			btnAvanzar = new JButton("+");
			btnAvanzar.setBackground(new Color(240, 240, 240));
			btnAvanzar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					ticketPescadería.avanzarTurno();
					String texto = String.format("%d", ticketPescadería.getTurno());
					getJtextoTurno().setText(texto);
					}catch(TicketException ex) {
						JOptionPane.showMessageDialog(getJpanelPrincipal(), ex.getMessage(), "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			});
			btnAvanzar.setMnemonic(KeyEvent.VK_ADD);
		}
		return btnAvanzar;
	}
	private JButton getBtnTicket() {
		if (btnTicket == null) {
			btnTicket = new JButton("Nuevo");
			btnTicket.setBackground(new Color(240, 240, 240));
			btnTicket.setMnemonic(KeyEvent.VK_N);
			
			btnTicket.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					try {
						ticketPescadería.tirarTicket();
						String texto = String.format("%d", ticketPescadería.getTicket());
						getJtextoTicket().setText(texto);
					}catch(TicketException ex) {
						JOptionPane.showMessageDialog(getJpanelPrincipal(), ex.getMessage(), "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
				}
				}
				
			});
	
		}
		return btnTicket;
	}
}
