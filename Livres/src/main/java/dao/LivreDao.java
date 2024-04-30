package dao;

import java.util.List;

import LivresPackage.Livres;

public interface LivreDao {
	public Livres Ajouter(Livres livre);
	public List<Livres> Afficher();
	public Livres Modifier(Livres livre);
	public void Supprimer(long id);
} 