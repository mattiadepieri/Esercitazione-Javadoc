
/**
 * @author Mattia De Pieri
 *
 */
public class CircoloSportivo {
	
	String nome;
	
	public int numeroIscritti[] = new int [150];
	
	/**
	 * <p> Metodo costruttore 
	 */
	public CircoloSportivo() {
		
	}
	
	
	/**
	 * <p> Metodo costruttore con annessi parametri.
	 * @param nome
	 */
	public CircoloSportivo(String nome){
		this.nome = nome;
	}
	
	
	
	/**
	 * <p> metodo utile a visualizzare l'elenco degli iscritti.
	 */
	public void elencoIscritti(){
		System.out.println("elencoIscritti");
	}
	
	
	/**
	 * <p> metodo utile a verificare l'elenco degli iscritti per ogni disciplina.
	 * @param disc
	 */
	public void elencoIscrittiPerDisciplina(String disc){
		System.out.println("elencoIscrittiPerDisciplina");
	}

}
