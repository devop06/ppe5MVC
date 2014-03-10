package annuaire.dao;

import annuaire.connexion.connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tony
 */
public class DaoEnsemble {
   
   Connection con;
   private final String reqVisualiser = "select colloque.*,personne.* from inscrire, colloque, personne where inscrire.num_pers = personne.num_pers and colloque.num_col = inscrire.num_col;";
   
   public DaoEnsemble()
   {
       con = connexion.connection();
   }
   
   /**
    * Récupère toutes les informations d'un évènement
    * @return ResultSet le résultat de la requête non trié
    */
   public ResultSet getAllInformations()
   {
          Statement stm;
          ResultSet resultats = null;
   
          try
          {
              stm =  con.createStatement();
              resultats = stm.executeQuery(reqVisualiser);      
          }
          catch(SQLException e)
          {
              e.toString();
          }
          
        return resultats;
   }
}
