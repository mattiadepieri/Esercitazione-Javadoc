
/**
 * @author Mattia De Pieri
 *
 */
public class Disciplina {
	
	private float mensile;
	private float annuale;
	public String nome;
	
	
	/**
	 *  <p> metodo costruttore;
	 */
	public Disciplina() {
	}
	
	
	/**
	 * <p> metodo costruttore con annessi parametri.
	 * @param mensile
	 * @param annuale
	 * @param nome
	 */
	public Disciplina(float mensile, float annuale, String nome){
		this.mensile = mensile;
		this.annuale = annuale;
		this.nome = nome;
	}
	
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private
	 * @return  un valore di tipo float della variabile mensile.
	 */
	public float getMensile() {
		return mensile;
	}
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private.
	 * @param mensile
	 */
	public void setMensile(float mensile) {
		this.mensile = mensile;
	}
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private.
	 * @return  un valore di tipo float della variabile annuale.
	 */
	public float getAnnuale() {
		return annuale;
	}
	
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private.
	 * @param annuale
	 */
	public void setAnnuale(float annuale) {
		this.annuale = annuale;
	}

}
