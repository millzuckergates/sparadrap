package com.stephane.entity;
public class Specialiste extends Personne{


    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------


    //--------------------- INSTANCE VARIABLES ---------------------------------
    private Specialite specialite;
    //--------------------- CONSTRUCTORS ---------------------------------------

        public Specialiste(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail, Specialite specialite) {
            super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);

            this.setSpecialite(specialite);
        }
    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------
    public Specialite getSpecialite() {
        return specialite;
    }
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    //--------------------- TO STRING METHOD------------------------------------
}

