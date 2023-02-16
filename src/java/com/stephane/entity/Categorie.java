package com.stephane.entity;

import java.util.ArrayList;

public class Categorie {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Categorie> categorieList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idCategorie;
    private String label;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Categorie(int idCategorie, String label) {
        this.setCategorie(categorie);
        this.setLabel(label);
    }

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
