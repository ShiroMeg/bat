package data;

public class Bateau {
	private String nom;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	



	public Bateau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bateau(String nom) {
		super();
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bateau [nom=" + nom + "]";
	}
	
	



	
	

}
