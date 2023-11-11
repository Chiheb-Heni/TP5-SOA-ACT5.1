package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.Date;

/**
 * Représente un compte bancaire
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    // Attributs
    private int code = 0;  // Identifiant unique du compte
    private double solde = 0.0;  // Solde actuel du compte
    @XmlTransient
    private Date date = new Date();  // Date de création du compte

    /**
     * Constructeur paramétré pour créer un compte avec des valeurs spécifiées.

     */
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.date = dateCreation;
    }

    /**
     * Constructeur par défaut pour créer un compte avec des valeurs par défaut.
     */
    public Compte() {
        // Le constructeur par défaut est vide
    }

    // Méthodes Getter et Setter


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }


    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return date;
    }

    public void setDateCreation(Date dateCreation) {
        this.date = dateCreation;
    }
}
