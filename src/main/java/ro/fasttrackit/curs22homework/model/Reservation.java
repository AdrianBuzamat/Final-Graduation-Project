package ro.fasttrackit.curs22homework.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
     private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    private Institution institution;


    public Reservation() {
    }

    public Reservation(Person person, City city, Institution institution) {
        this.person = person;
        this.city = city;
        this.institution = institution;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public City getCity() {
        return city;
    }

    public Institution getInstitution() {
        return institution;
    }
}
