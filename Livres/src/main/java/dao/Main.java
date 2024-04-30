package dao;

import java.sql.Date;

import LivresPackage.Livres;

public class Main { 

	public static void main(String[] args) {
		Date annee = new Date(2024,04,30);
		LivreDaoImpl dao= new LivreDaoImpl();
		Livres L1 = dao.Ajouter(new Livres(1,"aaa","zzz","eee",annee));
		Livres L2 = dao.Ajouter(new Livres(2,"aaa","zzz","eee",annee));
		Livres L3 = dao.Ajouter(new Livres(2,"aaa","TTTTTT","eee",annee));
	}
}