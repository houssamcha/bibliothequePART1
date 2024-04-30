package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import LivresPackage.Livres;

public class LivreDaoImpl implements LivreDao{

	@Override
	public Livres Ajouter(Livres livre) {
		Connection connection = ConnectionJDBC.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("INSERT INTO LIVRE (titre,auteur,editeur,annee_publication) VALUES(?,?,?,?)");
			
			ps.setString(1, livre.getTitre());
			ps.setString(2, livre.getAuteur());
			ps.setString(3, livre.getEditeur());
			ps.setDate(4, livre.getAnnee_publication());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(ID_LIVRE) AS MAXID_LIVRE FROM LIVRE");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				livre.setId_livre((int) rs.getLong("MAXID_LIVRE"));
			}
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return livre;
	}
	@Override
	public List<Livres> Afficher() {
		List<Livres> Livres=new ArrayList<Livres>();
        Connection connection = ConnectionJDBC.getConnection();
        try {
            PreparedStatement ps=connection.prepareStatement
                    ("SELECT * FROM livre");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Livres L=new Livres();
                L.setId_livre(rs.getInt("id_livre"));
                L.setTitre(rs.getString("titre"));
                L.setAuteur(rs.getString("editeur"));
                L.setEditeur(rs.getString("date_emprunt"));
                L.setAnnee_publication(rs.getDate("annee_publication"));
                Livres.add(L);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Livres;
	}
	@Override
	public Livres Modifier(Livres livre) {
		
		return null;
	}

	@Override
	public void Supprimer(long id) {
		
	}

}
