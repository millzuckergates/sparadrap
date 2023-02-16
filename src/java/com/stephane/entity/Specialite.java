package com.stephane.entity;

import java.util.ArrayList;

public class Specialite {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Specialite> specialiteList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idSpecialite;
    private String label;

    public Specialite(int idSpecialite, String label) {
        this.setIdSpecialite(idSpecialite);
        this.setLabel(label);
    }

    //--------------------- CONSTRUCTORS ---------------------------------------

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdSpecialite() {
        return idSpecialite;
    }

    public void setIdSpecialite(int idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
