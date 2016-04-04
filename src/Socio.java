
/**
 * @author Mattia De Pieri
 *
 */
public class Socio {
	
	private String nome;
	private String cognome;
	private String cf;
	
	
	/**
	 * <p>Metodo costruttore.
	 */
	public Socio() {
	}
	
	
	/**
	 * <p> Questo è un metodo costruttore con tutti i suoi parametri integrati.
	 * @param nome
	 * @param cognome
	 * @param cf
	 */
	public Socio(String nome, String cognome, String cf){
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	
	/**
	 * <p>Metodo utile a vedere una variabile posta come private
	 * @return un valore di tipo String della variabile nome.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private
	 * @return un valore di tipo String della variabile cognome.
	 */
	public String getCognome() {
		return cognome;
	}
	
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private
	 * @return un valore di tipo String della variabile cognome.
	 */
	public String getCf() {
		return cf;
	}
	
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private
	 * @param cf
	 */
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
	/**
	 * <p> Metodo che calcola la retta da versare
	 * 
	 */
	public float calcoloRetta(boolean isAnnuale){
		return 0;
	}
}
