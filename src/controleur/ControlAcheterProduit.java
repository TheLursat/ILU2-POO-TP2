package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	public boolean produitPresentDansLesEtals(String nomProduit) {
        if(village.rechercherVendeursProduit(nomProduit)==null) {
            return false;
        }
        return true;
    }

    public Gaulois[] vendeursDuProduit(String nomProduit) {
        return village.rechercherVendeursProduit(nomProduit);
    }
    public String[] donnerEtatVendeur() {
        return village.donnerEtatMarche();
    }
}
