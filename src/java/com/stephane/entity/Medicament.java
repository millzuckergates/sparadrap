package com.stephane.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medicament {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Medicament> medicamentList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idMedicament;
    private String nom;
    private int prix;
    private LocalDate dateMiseEnService;
    private int qteStock;
    private Categorie categorie;


    //--------------------- CONSTRUCTORS ---------------------------------------

    public Medicament(int idMedicament, String nom, int prix, LocalDate dateMiseEnService, int qteStock, Categorie categorie) {
        this.setIdMedicament(idMedicament);
        this.setNom(nom);
        this.setDateMiseEnService(dateMiseEnService);
        this.setQteStock(qteStock);
        this.setCategorie(categorie);
    }
    //--------------------- STATIC METHODS -------------------------------------
    public static Medicament listMedocs{
        return List<Medicament>;
    }
    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public LocalDate getDateMiseEnService() {
        return dateMiseEnService;
    }

    public void setDateMiseEnService(LocalDate dateMiseEnService) {
        this.dateMiseEnService = dateMiseEnService;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
