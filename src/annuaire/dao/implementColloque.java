package annuaire.dao;
import annuaire.metier.Colloque;
import java.util.List;
/**
 *
 * @author tony
 */
public interface implementColloque {
    

    public void ajouter(Colloque b);

    public void update(Colloque b);

    public void supprimer(int id);

    public  List<Colloque> getALL();

    public List<Colloque> getRechercheNom(String nom);


}
