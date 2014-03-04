package annuaire.dao;

import annuaire.connexion.connexion;
import annuaire.dao.*;
import annuaire.metier.Colloque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tony
 */
public class daoColloque implements implementColloque{
    
    Connection con;
    final String insert = "INSERT INTO colloque (intitule, date_debut, duree, nb_participant_max, description) VALUES ( ?, ?, ?, ?);";
    
    public daoColloque()
    {
        con = connexion.connection();
        
    }
    
    public void ajouter(Colloque b) {
       PreparedStatement statement = null; 
       try
       {
            statement = con.prepareStatement(insert);
            statement.setString(1, b.getIntituleColloque());
            statement.setString(2, b.getDateDebutColloque());
            statement.setInt(3, b.getDureeColloque());
            statement.setInt(4, b.getNbParticipantMax());
            statement.setString(5, b.getDescriptionColloque());
            
            statement.executeUpdate();
       }
       catch (SQLException ex) 
       {
       }
       finally {
            try
            {
                statement.close();
            } catch (SQLException ex) 
            {
                ex.printStackTrace();
            }
       }
    }
    

    public void update(Colloque b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Colloque> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Colloque> getRechercheNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
