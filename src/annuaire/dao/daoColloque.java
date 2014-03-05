package annuaire.dao;

import annuaire.connexion.connexion;
import annuaire.dao.*;
import annuaire.metier.Colloque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author tony
 */
public class daoColloque implements implementColloque{
    
    Connection con;
    final String insert = "INSERT INTO colloque (intitule, date_debut, duree, nb_participant_max, description) VALUES ( ?, ?, ?, ?);";
    final String maxId = "SELECT maxid from maxid;";
    
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
    
    /**
     * retourne l'id max de la base de donnée des colloques
     * @return int l'id maximum
     */
    public int getMaxId()
    {
        Statement stm ;
        ResultSet resultats;
        int maxid = -1;
        try{
            stm =  con.createStatement();
            resultats = stm.executeQuery(maxId);
            resultats.next();
            maxid = resultats.getInt("maxid");
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
       
        return maxid;
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
