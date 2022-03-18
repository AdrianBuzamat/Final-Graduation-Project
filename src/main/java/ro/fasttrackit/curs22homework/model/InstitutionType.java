package ro.fasttrackit.curs22homework.model;

public enum InstitutionType {
    CINEMA("Cinema"),
    MEDICAL_CLINIQUE("Clinica medicala"),
    RESTAURANT("Restaurant"),
    HOTEL("Hotel");

    final String name;

    InstitutionType(String name){
        this.name=name;
    }
}
