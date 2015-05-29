package metier;

import java.util.List;

import model.Pays;
import model.Ville;
import dao.IdaoVille;

public class VilleMetier {

	IdaoVille daoVille;

	public List<Ville> getallVilles() {
		return daoVille.getallVille();

	}

	public  List<Ville> getVillebyid(int id) {

		return daoVille.getVillebyid(id);

	}

	public void addVille(Ville b) {

		daoVille.addVille(b);

	}

	public void setdaoVille(IdaoVille daoVille) {
		this.daoVille = daoVille;
	}

	public void deleteVille(int i) {
		daoVille.deleteVille(i);
		;
	}

	public void updateVille(Ville c) {
		daoVille.updateVille(c);
	}
	
	public Pays getPaysByVille(int i ) {
		return daoVille.getPaysByVille(i);
	}

}
