package annuaire.controleur;

import annuaire.dao.daoColloque;
import annuaire.metier.Colloque;

import annuaire.view.FrameCreerColloque;


/**
 * @author tony
 */
public class controleurColloque {
    
      FrameCreerColloque frameCreate;
      
      public controleurColloque()
      {
          this.frameCreate = new FrameCreerColloque();
          this.frameCreate.setVisible(true);
      }
           
      public void colloqueEnregistrement()
      {
          String numColloque = frameCreate.getTxtIdColloque().getText();
          long numC =  Long.parseLong(numColloque);
          int nbParticipantMax = Integer.parseInt(frameCreate.getLblParticipantMax().getText());
          int dureeColloque;  String intituleColloque; String dateDebutColloque; String descriptionColloque;
          // Colloque c = new Colloque();
       
      }
               
    
}
