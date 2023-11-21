package controleur;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public Boolean isVendeur(String nomVendeur) {
		return (controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur) !=null);
	}
	
	//TODO a completer

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		String[] donneesEtal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur).etatEtal();
		controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur).libererEtal();
		donneesEtal[0]=String.valueOf(false);
		return donneesEtal;
	}

}
