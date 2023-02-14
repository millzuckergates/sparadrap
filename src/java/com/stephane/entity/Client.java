package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

import java.time.LocalDate;

public class Client extends Personne {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private String numeroSecu;
    private LocalDate dateDeNaissance;
    private Medecin medecinTraitant;
    private Mutuelle mutuelle;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Client(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail, String numeroSecu, Medecin medecinTraitant, Mutuelle mutuelle) {
        super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);
        this.setNumeroSecu(numeroSecu);
        this.setDateDeNaissance(dateDeNaissance);
        this.setMedecinTraitant(medecinTraitant);
        this.setMutuelle(mutuelle);
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
    public Medecin getMedecinTraitant() {
        return medecinTraitant;
    }

    public void setMedecinTraitant(Medecin medecinTraitant) {
        this.medecinTraitant = medecinTraitant;
    }

    public Mutuelle getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(Mutuelle mutuelle) {
        this.mutuelle = mutuelle;
    }

    //--------------------- TO STRING METHOD------------------------------------
}

