package annuaire.controleur;
import annuaire.dao.daoColloque;
import annuaire.metier.Colloque;
import annuaire.view.FrameCreerColloque;
import annuaire.view.FrameSupprimerColloque;



/**
 * @author tony
 */
public class controleurColloque {
  
      daoColloque dao;
      
      public controleurColloque()
      {
          dao = new daoColloque();
      }
           
      public void colloqueEnregistrement(FrameCreerColloque frameCreate)
      {
          
          String numColloque = frameCreate.getTxtIdColloque().getText();
          long numC =  Long.parseLong(numColloque);
          int nbParticipantMax = Integer.parseInt(frameCreate.getTxtMaxPart().getText());
          int dureeColloque = Integer.parseInt(frameCreate.getTxtDuree().getText());
          String intituleColloque = frameCreate.getTxtIntitule().getText(); 
          String dateDebutColloque = frameCreate.getTxtDate().getText();
          String descriptionColloque = frameCreate.getjTextArea1().getText();
          
          Colloque c = new Colloque(numC,dureeColloque,nbParticipantMax,intituleColloque,dateDebutColloque,descriptionColloque);
          dao.ajouter(c);
                  
      }
      
      public void colloqueSupprimer(FrameSupprimerColloque frameDelete)
      {
         // frameDelete.gett
          // this.dao.supprimer(id);
      }
               
    
}
