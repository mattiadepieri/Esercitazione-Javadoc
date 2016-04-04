
/**
 * @author Mattia De Pieri
 *
 */

public class Nuoto {
	private String codiceCorso;
	public int corsia;
	
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private.
	 * @param codiceCorso
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private.
	 * @return un valore di tipo String della variabile codiceCorso.
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	
	/**
	 * <p> metodo costruttore.
	 */
	public Nuoto() {
		
	}
	
	
	
	/**
	 * <p> metodo costruttore con annessi parametri.
	 * @param codiceCorso
	 * @param corsia
	 */
	public Nuoto (String codiceCorso, int corsia){
		this.codiceCorso = codiceCorso;
		this.corsia = corsia;
	}
}
