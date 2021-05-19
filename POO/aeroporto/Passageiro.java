package aeroporto;

public class Passageiro {
	boolean reserva;
	int voo;
	boolean checkin;
	Pessoa pessoa;
	
	public Passageiro (boolean reserva, int voo, boolean checkin) {
		this.reserva = reserva;
		this.voo = voo;
		this.checkin = checkin;
	}
	
	public void verificarReserva() {
		if (reserva == true) {
			System.out.println("O passageiro possui reserva no voo " + voo);
		} 
		else {
			System.out.println("O passagerio não possui reserva");
		}//end if					
	}// end verificarReserva
	
	
	public void verificarCheckin() {
		if (checkin == false) {
			System.out.println("O passageiro necessita realizar o checkin");
		}
		else {
			System.out.println("O passageiro ja realizou o checkin");
		}//end if
	}//end verificarCheckin
	
}// end class

