package annuaire.dao;

import annuaire.connexion.connexion;
import annuaire.dao.*;
import annuaire.metier.Colloque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author tony
 */
public class daoColloque implements implementColloque{
    
  
    Connection con;
    final String insert = "INSERT INTO colloque (intitule, date_debut, duree, nb_participant_max, description) VALUES ( ?, ?, ?, ?, ?);";
    final String delete = "delete from colloque where num_col = ?";
    final String maxId = "SELECT maxid from maxid;";
    final String selectAll = "SELECT * from colloque";
    
    public daoColloque()
    {
        
        con = connexion.connection();     
    }
    /**
     * Ajoute à la base de donnée une colloque
     * @param uneColloque type colloque en paramètre
     */
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
           System.out.println(ex.toString());
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
   
    /**
     * Supprime une colloque par l'id passé en parametre
     * @param id id de la colloque
     */
    public void supprimer(int id) {
       PreparedStatement statement = null; 
       try
       {
            statement = con.prepareStatement(delete);        
            statement.setInt(1, id);
            statement.executeUpdate();
       }
       catch (SQLException ex) 
       {
           System.out.println(ex.toString());
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
     * Retourne un tableau de colloque chargé grâce aux informations 
     * de la base de donnée
     * @return ArrayList tableau de colloque
     */
    public List<Colloque> getALL() {
        
        ArrayList<Colloque> listeColloque = new ArrayList();  
        Statement stm ;
        ResultSet resultats;
        // déclaration des variables pour la création de la colloque
        long numC;
        int nbParticipantMax;
        int dureeColloque;
        String intituleColloque; 
        String dateDebutColloque;
        String descriptionColloque;
          
        try{
            stm =  con.createStatement();
            resultats = stm.executeQuery(selectAll);
            Colloque c;
            
            while(resultats.next())
            {
                numC = resultats.getLong("num_col");
                nbParticipantMax = resultats.getInt("nb_participant_max");
                dureeColloque = resultats.getInt("duree");
                intituleColloque = resultats.getString("intitule");
                dateDebutColloque = resultats.getString("date_debut");
                descriptionColloque = resultats.getString("description");
                c  = new Colloque(numC,dureeColloque, nbParticipantMax, intituleColloque, dateDebutColloque,descriptionColloque);
                listeColloque.add(c);
            }   
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        
        return listeColloque;    
    }

    public List<Colloque> getRechercheNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
