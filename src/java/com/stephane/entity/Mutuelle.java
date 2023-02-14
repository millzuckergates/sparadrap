package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

public class Mutuelle {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------


    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idMutuelle;
    private String nom;
    private String adresse;
    private String codePostal;
    private String telephone;
    //--------------------- CONSTRUCTORS ---------------------------------------

    public Mutuelle(int idMutuelle, String nom, String adresse, String codePostal, String telephone) {
        this.setIdMutuelle(idMutuelle);
        this.setNom(nom);
        this.setAdresse(adresse);
        this.setCodePostal(codePostal);
        this.setTelephone(telephone);
    }

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdMutuelle() {
        return idMutuelle;
    }

    public void setIdMutuelle(int idMutuelle) {
        this.idMutuelle = idMutuelle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        // si le controleur valide alors
        if (ControleDeValeur.codePostalValide(codePostal) || this.codePostal.length() != 5){
            // je passe le parametre
            this.codePostal = codePostal;
        }else{
            //sinon je mets une erreur
            System.out.println("Hophophop");
        }
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
