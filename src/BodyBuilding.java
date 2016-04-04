
/**
 * @author Mattia De Pieri
 *
 */

public class BodyBuilding extends Disciplina {
	
	private String peso;
	
	
	
	/**
	 * <p> Metodo utile a vedere una variabile posta come private
	 * @return un valore di tipo String della variabile peso.
	 */
	public String getPeso() {
		return peso;
	}
	
	
	/**
	 * <p> Metodo utile a modificare una variabile posta come private.
	 * @param peso
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
		
	
	/**
	 * <p> metodo costruttore
	 */
	public BodyBuilding() {
	}
	
	
	
	
	/**
	 * <p> metodo costruttore con annessi parametri.
	 * @param nome
	 */
	public BodyBuilding(String nome){
		this.nome = nome;
	}

}
