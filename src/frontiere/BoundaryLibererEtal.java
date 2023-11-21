package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO a completer
		if(!controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
		}
		else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			StringBuilder recap = new StringBuilder("Vous avez vendu ");
			recap.append(donneesEtal[4]);
			recap.append(" sur ");
			recap.append(donneesEtal[3]);
			recap.append(" ");
			recap.append(donneesEtal[2]);
			recap.append(".\n");
			recap.append("En revoir ");
			recap.append(nomVendeur);
			recap.append(", passez une bonne journée.\n");
			System.out.println(recap);
		}
	}

}
