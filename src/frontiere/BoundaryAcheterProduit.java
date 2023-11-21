package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		// TODO à completer
		System.out.println("Quel produit voulez vous acheter ? \n");
		String produit = scan.nextLine();
		boolean produitPresent = controlAcheterProduit.produitPresentDansLesEtals(produit);
		if(produitPresent ==false) {
			System.out.println("Désolé, personne ne vend ce produit au marché \n");
		}
		else {
			Gaulois[] tabVendeurs = controlAcheterProduit.vendeursDuProduit(produit);
			int nbVendeursProduit = controlAcheterProduit.vendeursDuProduit(produit).length;
			System.out.println("Chez quel commerçant voulez-vous acheter des "+produit+" ? \n");
			for(int i=0;i<nbVendeursProduit;i++) {
				int numEtal = i+1;
				System.out.println(numEtal +" - "+tabVendeurs[i].getNom()+"\n");
			}
			int numVendeur = scan.nextInt();
			if((numVendeur<0)||(numVendeur>nbVendeursProduit))
				do {
					System.out.println("Je suis désolé mais il faut être un habitant de notre village pour commercer ici. \n");
					numVendeur = scan.nextInt();
				}while((numVendeur<0)||(numVendeur>nbVendeursProduit));
				
			int IndiceVendeur = numVendeur-1; 
			String[] etalVendeur = controlAcheterProduit.donnerEtatVendeur();
			String quantite = etalVendeur[1];
			int quantiteEntier = Integer.parseInt(quantite);
			System.out.println(nomAcheteur+" se déplace jusqu'à l'étal du vendeur Bonemine \n");
			System.out.println("Bonjour "+nomAcheteur+"\n");
			System.out.println("Combien de "+produit+" voulez-vous acheter ? \n");
			int nbProduitAAcheter = scan.nextInt();
			if(quantiteEntier == 0) {
				System.out.println(nomAcheteur+" veut acheter "+nbProduitAAcheter+" "+produit+", malheureusement, il n'y en a plus \n");
			}
			else if(quantiteEntier<nbProduitAAcheter) {
				System.out.println(nomAcheteur+" veut acheter "+nbProduitAAcheter+" "+produit+", malheureusement, il n'y en a plus que "+quantiteEntier+". "+nomAcheteur+" achète tout le stock de "+tabVendeurs[IndiceVendeur].getNom()+"\n");
				quantiteEntier = 0;
			}
			else {
				System.out.println(nomAcheteur+" achète "+nbProduitAAcheter+" à "+tabVendeurs[IndiceVendeur].getNom());
				quantiteEntier -= nbProduitAAcheter;
			}
			
			
		}
	}
}
