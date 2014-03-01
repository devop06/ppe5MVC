package annuaire.metier;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author tony
 */
public class Colloque {
    
    private long numColloque;
    private int dureeColloque,nbParticipantMax;
    private String intituleColloque,dateDebutColloque,descriptionColloque;
    private ArrayList<Personne> listeP;
       
    public Colloque(long numColloque, int dureeColloque, int nbParticipantMax, String intituleColloque, String dateDebutColloque, String descriptionColloque) {
        
        this.numColloque = numColloque;
        this.dureeColloque = dureeColloque;
        this.nbParticipantMax = nbParticipantMax;
        this.intituleColloque = intituleColloque;
        this.dateDebutColloque = dateDebutColloque;
        this.descriptionColloque = descriptionColloque;
        this.listeP = new ArrayList();
    }
    
    /**
     * Ajoute une personne à la liste des personnes 
     * qui participe à la colloque
     * @param p 
     */
    public void ajouterPersonne(Personne p)
    {
        this.listeP.add(p);
    }
    
    public long getNumColloque() {
        return numColloque;
    }

    public void setNumColloque(long numColloque) {
        this.numColloque = numColloque;
    }

    public int getDureeColloque() {
        return dureeColloque;
    }

    public void setDureeColloque(int dureeColloque) {
        this.dureeColloque = dureeColloque;
    }

    public int getNbParticipantMax() {
        return nbParticipantMax;
    }

    public void setNbParticipantMax(int nbParticipantMax) {
        this.nbParticipantMax = nbParticipantMax;
    }

    public String getIntituleColloque() {
        return intituleColloque;
    }

    public void setIntituleColloque(String intituleColloque) {
        this.intituleColloque = intituleColloque;
    }

    public String getDateDebutColloque() {
        return dateDebutColloque;
    }

    public void setDateDebutColloque(String dateDebutColloque) {
        this.dateDebutColloque = dateDebutColloque;
    }

    public String getDescriptionColloque() {
        return descriptionColloque;
    }

    public void setDescriptionColloque(String descriptionColloque) {
        this.descriptionColloque = descriptionColloque;
    }
    
    
    
}
