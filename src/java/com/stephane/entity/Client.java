package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

import java.time.LocalDate;

public class Client extends Personne {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private String numeroSecu;
    private LocalDate dateDeNaissance;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Client(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail, String numeroSecu) {
        super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);
        this.setNumeroSecu(numeroSecu);
        this.setDateDeNaissance(dateDeNaissance);
    }

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public String getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(String numeroSecu) {
        if (ControleDeValeur.codePostalValide(numeroSecu) || this.numeroSecu.length() != 15){
            System.out.println("Erreur sur le num de secu");
        }else{
            this.numeroSecu = numeroSecu;
        }
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    //--------------------- TO STRING METHOD------------------------------------
}

