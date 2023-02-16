package com.stephane.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ordonnance {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Ordonnance> ordonnanceList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private int idOrdonnance;
    private LocalDate datePrescription;
    private Personne prescripteur;
    private Personne client;
    private ArrayList<Medicament> medocs;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Ordonnance(int idOrdonnance, LocalDate datePrescription, Personne prescripteur, Personne client, ArrayList<Medicament> medocs) {
        this.setIdOrdonnance(idOrdonnance);
        this.setDatePrescription(datePrescription);
        this.setPrescripteur(prescripteur);
        this.setClient(client);
        this.setMedocs(medocs);
    }

    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public int getIdOrdonnance() {
        return idOrdonnance;
    }

    public void setIdOrdonnance(int idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }

    public LocalDate getDatePrescription() {
        return datePrescription;
    }

    public void setDatePrescription(LocalDate datePrescription) {
        this.datePrescription = datePrescription;
    }

    public Personne getPrescripteur() {
        return prescripteur;
    }

    public void setPrescripteur(Personne prescripteur) {
        this.prescripteur = prescripteur;
    }

    public Personne getClient() {
        return client;
    }

    public void setClient(Personne client) {
        this.client = client;
    }
    public List<Medicament> getMedocs() {
        return medocs;
    }

    public void setMedocs(List<Medicament> medocs) {
        this.medocs = medocs;
    }
    //--------------------- TO STRING METHOD------------------------------------
}
