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
	
	public void avanzarTurno() throws TicketException{
		if(turno == número) {
			throw new TicketException("Ya no hay más tickets sacados");
		}
		
		if(turno == 99) {
			turno = 0;
		}
		turno = turno+1;
	}
	
	public void tirarTicket() throws TicketException{
		if(número >= turno + 10 || número<=turno-5) {
			throw new TicketException("Ya hay demasiados tickets en cola");
		}
		if(número == 99) {
			número = 0;
		}
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
