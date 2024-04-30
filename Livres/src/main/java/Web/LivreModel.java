package Web;

import java.util.ArrayList;
import java.util.List;

import LivresPackage.Livres;

public class LivreModel {
	private String mot_cle;
	private List<Livres> stringList = new ArrayList<Livres>();
	public String getMot_cle() {
		return mot_cle;
	}
	public void setMot_cle(String mot_cle) {
		this.mot_cle = mot_cle;
	}
	public List<Livres> getStringList() {
		return stringList;
	}
	public void setStringList(List<Livres> stringList) {
		this.stringList = stringList;
	}

}
