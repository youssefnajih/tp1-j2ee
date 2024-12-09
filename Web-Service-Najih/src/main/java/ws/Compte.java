package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)

public class Compte {
    
    private int code;

    private double solde;
@XmlTransient
    private Date dateCreation;
    public Compte() {

    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code=code;
        this.dateCreation=dateCreation;
        this.solde=solde;

    }

    public int getCode() {
        return code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
