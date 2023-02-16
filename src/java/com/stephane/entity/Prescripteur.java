package com.stephane.entity;

import java.time.LocalDate;
import java.util.List;

public interface Prescripteur{

    public default Ordonnance prescrire(Personne client, LocalDate date, Personne prescripteur, List<Medicament> medocs){
        return new Ordonnance(1,date, prescripteur, client, medocs);
    };
}
