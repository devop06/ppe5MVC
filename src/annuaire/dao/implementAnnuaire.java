
package annuaire.dao;

import java.util.List;
import annuaire.model.*;

public interface implementAnnuaire {

    public void ajouter(annuaire b);

    public void update(annuaire b);

    public void supprimer(int id);

    public List<annuaire> getALL();

    public List<annuaire> getRechercheNom(String nom);
}
