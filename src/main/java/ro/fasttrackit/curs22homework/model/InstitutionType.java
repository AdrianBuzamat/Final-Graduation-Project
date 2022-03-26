package ro.fasttrackit.curs22homework.model;

import javax.xml.bind.annotation.XmlType;

public enum InstitutionType {
    CINEMA("Cinema"),
    MEDICAL_CLINIQUE("Clinica medicala"),
    RESTAURANT("Restaurant"),
    HOTEL("Hotel"),
    DEFAULT("Unspecified");

    final String name;

    InstitutionType(String name){
        this.name=name;
    }
}
