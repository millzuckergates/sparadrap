package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

public abstract class Personne {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idPersonne;
    private String nom;
    private String prenom;
    private String codePostal;
    private String ville;
    private String telephone;
    private String mail;

    //--------------------- CONSTRUCTORS ---------------------------------------
    public Personne(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail) {
        this.setIdPersonne(idPersonne);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setCodePostal(codePostal);
        this.setVille(ville);
        this.setTelephone(telephone);
        this.setMail(mail);
    }


    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    //--------------------- TO STRING METHOD------------------------------------
}

