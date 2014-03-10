
package annuaire.dao;
import annuaire.connexion.connexion;
import annuaire.metier.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class daoPersonne implements implementPersonne {

    Connection connection;
    final String insert = "INSERT INTO personne (nom_pers,prenom_pers,email_pers,date_naiss,organisation,observations) VALUES ( ?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE personne set num=?, nom=?, adresse=? where id=? ;";
    final String delete = "DELETE FROM personne where id=? ;";
    final String select = "SELECT * FROM personne;";
    final String recherchenom = "SELECT * FROM personne where nom like ?";
    final String maxId = "SELECT maxidP from maxidp;";
    public daoPersonne() {
        connection = connexion.connection();
    }

    public void ajouter(Personne p) {
        PreparedStatement statement = null; 
       
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, p.getNomPers() );
            statement.setString(2, p.getPrenomPers());
            statement.setString(3, p.getEmailPers());
            statement.setString(4, p.getDateNaissancePers());
            statement.setString(5, p.getOrganisationPers());
            statement.setString(6, p.getObservationPers());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
          
        } catch (SQLException ex) {
            //System.out.println(ex.toString());
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            }
        }
    }

    public void update(Personne b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void supprimer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Personne> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Personne> getRechercheNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public int getMaxIdP()
    {
        Statement stm ;
        ResultSet resultats;
        int maxid = -1;
        try{
            stm =  connection.createStatement();
            resultats = stm.executeQuery(maxId);
            resultats.next();
            maxid = resultats.getInt("maxidP");
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
       
        return maxid;
    }
}
