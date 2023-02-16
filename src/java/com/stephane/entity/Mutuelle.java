package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

import java.util.ArrayList;
import java.util.Map;

public class Mutuelle {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------


    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idMutuelle;
    private String nom;
    private String adresse;
    private String codePostal;
    private String telephone;
    private Departement departement;
    private Map<Integer, Medicament> medocMap;
    //--------------------- CONSTRUCTORS ---------------------------------------

    public Mutuelle(int idMutuelle, String nom, String adresse, String codePostal, String telephone, Map<Integer, Medicament> medocMap) {
        this.setIdMutuelle(idMutuelle);
        this.setNom(nom);
        this.setAdresse(adresse);
        this.setCodePostal(codePostal);
        this.setTelephone(telephone);
        this.setDepartement(departement);
        this.setMedocMap(medocMap);


    }

    //--------------------- STATIC METHODS -------------------------------------
    private static ArrayList<Mutuelle> mutuelleList = new ArrayList<>();

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
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public Map<Integer, Medicament> getMedocMap() {
        return medocMap;
    }

    public void setMedocMap(Map<Integer, Medicament> medocMap) {
        this.medocMap = medocMap;
    }

    public static ArrayList<Mutuelle> getMutuelleList() {
        return mutuelleList;
    }

    public static void setMutuelleList(ArrayList<Mutuelle> mutuelleList) {
        Mutuelle.mutuelleList = mutuelleList;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
