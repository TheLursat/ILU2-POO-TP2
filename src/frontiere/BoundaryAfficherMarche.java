package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		if(infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		}
		else {
			System.out.println(nomAcheteur + ", vous trouverez au marché :");
			int i = 0;
			StringBuilder recap = new StringBuilder();
			while(i<infosMarche.length) {
				recap.append("- ");
				recap.append(infosMarche[i]);
				i++;
				recap.append(" qui vend ");
				recap.append(infosMarche[i]);
				i++;
				recap.append(" ");
				recap.append(infosMarche[i]);
				i++;
				recap.append("\n");
			}
			System.out.println(recap);
		}
	}
}
