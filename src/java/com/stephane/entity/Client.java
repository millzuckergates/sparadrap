package com.stephane.entity;

import com.stephane.utility.ControleDeValeur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {

    //--------------------- CONSTANTS ------------------------------------------

    //--------------------- STATIC VARIABLES -----------------------------------
    private static ArrayList<Client> clientList = new ArrayList<>();

    //--------------------- INSTANCE VARIABLES ---------------------------------
    private String numeroSecu;
    private LocalDate dateDeNaissance;
    private Medecin medecinTraitant;
    private Mutuelle mutuelle;
    private ArrayList<Specialite> specialiteList;
    private List<Ordonnance> ordonnanceList;

    //--------------------- CONSTRUCTORS ---------------------------------------

    public Client(
            int idPersonne,
            String nom,
            String prenom,
            String codePostal,
            String ville,
            String telephone,
            String mail,
            String numeroSecu,
            Medecin medecinTraitant,
            Mutuelle mutuelle,
            ArrayList<Specialite> specialiteList
    ) {
        super(idPersonne, nom, prenom, codePostal, ville, telephone, mail);
        this.setNumeroSecu(numeroSecu);
        this.setDateDeNaissance(dateDeNaissance);
        this.setMedecinTraitant(medecinTraitant);
        this.setMutuelle(mutuelle);
        this.setSpecialiteList(specialiteList);
    }

    public static ArrayList<Client> getClientList() {
        return clientList;
    }


    //--------------------- STATIC METHODS -------------------------------------

    //--------------------- INSTANCE METHODS -----------------------------------

    //--------------------- ABSTRACT METHODS -----------------------------------

    //--------------------- STATIC - GETTERS - SETTERS -------------------------

    //--------------------- GETTERS - SETTERS ----------------------------------

    public String getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(String numeroSecu) {
        if (ControleDeValeur.codePostalValide(numeroSecu) || this.numeroSecu.length() != 15){
            System.out.println("Erreur sur le num de secu");
        }else{
            this.numeroSecu = numeroSecu;
        }
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    public Medecin getMedecinTraitant() {
        return medecinTraitant;
    }

    public void setMedecinTraitant(Medecin medecinTraitant) {
        this.medecinTraitant = medecinTraitant;
    }

    public Mutuelle getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(Mutuelle mutuelle) {
        this.mutuelle = mutuelle;
    }

    public List<Ordonnance> getOrdonnanceList() {
        return ordonnanceList;
    }

    public void setOrdonnanceList(List<Ordonnance> ordonnanceList) {
        this.ordonnanceList = ordonnanceList;
    }
    public static void setClientList(ArrayList<Client> clientList) {
        Client.clientList = clientList;
    }

    public ArrayList<Specialite> getSpecialiteList() {
        return specialiteList;
    }

    public void setSpecialiteList(ArrayList<Specialite> specialiteList) {
        this.specialiteList = specialiteList;
    }


    //--------------------- TO STRING METHOD------------------------------------
}

