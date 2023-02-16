package com.stephane.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Specialiste extends Personne implements Prescripteur{


    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Specialiste> specialisteList = new ArrayList<>();
    //--------------------- INSTANCE VARIABLES ---------------------------------
    private Specialite specialite;
    //--------------------- CONSTRUCTORS ---------------------------------------

    public Specialiste(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail, Specialite specialite) {
        super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);

        this.setSpecialite(specialite);
    }
    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    @Override
    public Ordonnance prescrire(Personne client, LocalDate date, Personne prescripteur, List<Medicament> medocs) {
        return Prescripteur.super.prescrire(client, date, prescripteur, medocs);
    }


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

