package annuaire.controleur;
import annuaire.dao.daoPersonne;
import annuaire.metier.Personne;
import annuaire.view.FrameCreerPersonne;



/**
 * @author tony
 */
public class controleurPersonne {
  
      daoPersonne dao;
      
      public controleurPersonne()
      {
          dao = new daoPersonne();
      }
           
      public void personneEnregistrement(FrameCreerPersonne frame)
      {
          long numPers = Long.parseLong(frame.getTxtNumeroPersonne().getText());
          String nomPers = frame.getTxtNomPersonne().getText();
          String prenomPers = frame.getTxtPrenomPersonne().getText();
          String emailPers = frame.getTxtEmailPersonne().getText();
          String dateNaissancePers = frame.getTxtDateNaissancePersonne().getText();
          String organisationPers = frame.getTxtOrganisation().getText();
          String observationPers = frame.getTxtaObservationPersonne().getText();
          Personne p = new Personne(numPers,nomPers,prenomPers,emailPers,dateNaissancePers,organisationPers,observationPers);
          dao.ajouter(p);
                  
      }
      
      public void personneAjoutBase(Personne p)
      {
          dao.ajouter(p);
      }
      
      public boolean getExtension(String fichier)
      {
          String extension = "";
          int mid = fichier.lastIndexOf(".");
          extension = fichier.substring(mid+1,fichier.length());
          if (extension.compareTo("csv") == 0)
          {
              return true;
          }else{
              return false;
          }
          
      }
     
}
               
    

