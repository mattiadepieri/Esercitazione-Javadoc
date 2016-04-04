
/**
 * @author Mattia De Pieri
 *
 */
public class Aerobica extends Disciplina{
	
	private String codiceCorso;
	
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private.
	 * @return valore di tipo String della variabile codiceCorso.
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	
	
	/**
	 * Metodo utile a modificare una variabile posta come private.
	 * @param codiceCorso
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	
	
	/**
	 * <p> metodo costruttore
	 */
	public Aerobica() {
		
	}
	
	
	/**
	 * <p> metodo costruttore con annessi parametri.
	 * @param codiceCorso
	 */
	public Aerobica (String codiceCorso){
		this.codiceCorso = codiceCorso;
	}
}
