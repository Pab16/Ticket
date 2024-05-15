package jcolonia.daw2023.wbuildercero;

public class Ticket {
	private int número;
	private int turno;
	private String título;
	
	public Ticket(String título) {
		this.título = título;
	}
	
	public String getTítulo() {
		return título;
	}
	
	public void avanzarTurno() {
		if(turno == 99) {
			turno = 0;
		}
		turno = turno+1;
	}
	
	public void tirarTicket() {
		
		número = número +1;
	}
	
	public int getTurno() {
		return turno;
	}
	
	public int getTicket() {
		return número;
	}
	
	public void restablecer() {
		turno = 0;
		número = 0;
	}
}
