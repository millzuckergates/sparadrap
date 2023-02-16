package com.stephane.entity;

import java.util.ArrayList;

public class Departement {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Departement> departementList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idDepartement;
    private String label;

    public Departement(int idDepartement, String label) {
        this.setIdDepartement(idDepartement);
        this.setLabel(label);
    }

    //--------------------- CONSTRUCTORS ---------------------------------------

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
