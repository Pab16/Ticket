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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JTextField jtextoTurno;
	private JPanel jpanelAccion;
	private JButton btnAvanzar;
	private JButton btnTicket;
	private JPanel panel;
	private JTextField jtextoTicket;
	private JLabel lblNewLabel;

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
		setBounds(100, 100, 499, 358);
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
			jpanelExterior.add(getPanel_2(), BorderLayout.SOUTH);
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
			GroupLayout gl_jpanelPrincipal = new GroupLayout(jpanelPrincipal);
			gl_jpanelPrincipal.setHorizontalGroup(
				gl_jpanelPrincipal.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_jpanelPrincipal.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(gl_jpanelPrincipal.createParallelGroup(Alignment.LEADING)
							.addComponent(getJpanelNombres(), GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
							.addComponent(getJpanelInfo(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(getPanel(), GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGap(43))
			);
			gl_jpanelPrincipal.setVerticalGroup(
				gl_jpanelPrincipal.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_jpanelPrincipal.createSequentialGroup()
						.addComponent(getJpanelNombres(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(getJpanelInfo(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(60)
						.addComponent(getPanel(), GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			jpanelPrincipal.setLayout(gl_jpanelPrincipal);
		}
		return jpanelPrincipal;
	}
	private JPanel getJpanelInfo() {
		if (jpanelInfo == null) {
			jpanelInfo = new JPanel();
			jpanelInfo.setLayout(new GridLayout(1, 2, 10, 0));
			jpanelInfo.add(getJtextoTurno());
		}
		return jpanelInfo;
	}
	private JPanel getJpanelNombres() {
		if (jpanelNombres == null) {
			jpanelNombres = new JPanel();
			jpanelNombres.setLayout(new GridLayout(1, 0, 10, 0));
			jpanelNombres.add(getTxtTicket());
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
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(0, 2, 0, 0));
			panel.add(getLblNewLabel());
			panel.add(getJtextoTicket());
		}
		return panel;
	}
	private JTextField getJtextoTicket() {
		if (jtextoTicket == null) {
			jtextoTicket = new JTextField();
			jtextoTicket.setText("0");
			jtextoTicket.setHorizontalAlignment(SwingConstants.CENTER);
			jtextoTicket.setFont(new Font("Noto Sans", Font.BOLD, 10));
			jtextoTicket.setEnabled(false);
			jtextoTicket.setEditable(false);
			jtextoTicket.setDisabledTextColor(Color.BLACK);
			jtextoTicket.setColumns(10);
		}
		return jtextoTicket;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Tickets");
		}
		return lblNewLabel;
	}
}
