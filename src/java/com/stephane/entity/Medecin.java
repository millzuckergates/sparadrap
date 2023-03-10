package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

import java.util.ArrayList;


public class Medecin extends Personne implements Prescripteur {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Medecin> medecinList = new ArrayList<>();
    //--------------------- INSTANCE VARIABLES ---------------------------------
    private String numeroAgrement;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Medecin(int idPersonne, String nom, String prenom, String codePostal, String ville, String telephone, String mail, String numeroAgrement) {
        super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);
        this.setNumeroAgrement(numeroAgrement);
    }

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public String getNumeroAgrement() {
        return numeroAgrement;
    }

    public void setNumeroAgrement(String numeroAgrement) {
        if (ControleDeValeur.codePostalValide(numeroAgrement) || this.numeroAgrement.length() != 11){
            System.out.println("Erreur sur le num d'agrement'");
        }else{
            this.numeroAgrement = numeroAgrement;
        }
    }
    //--------------------- TO STRING METHOD------------------------------------
}

